package com.example.gemfirelookasidecache;


import org.apache.geode.cache.GemFireCache;
import org.apache.geode.cache.Region;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
class DemoService {

    DemoRepository demoRepository;

    GemFireCache cache;

    public DemoService(DemoRepository demoRepository, GemFireCache cache) {
        this.demoRepository = demoRepository;
        this.cache = cache;
    }

    @Cacheable("Cache")
    public List<DemoEntity> getter() {
        Pageable pageable = PageRequest.of(0, 5);
        List<DemoEntity> demoEntities = this.demoRepository.findAll(pageable).getContent();
        return demoEntities;
    }

    void setter(String aaa) {
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setAaa(aaa);
        demoRepository.save(demoEntity);
    }

    //https://knowledge.broadcom.com/external/article/294117/gfsh-command-remove-region-does-not-sup.html
    //@CacheEvict(allEntries = true, value = "Cache")
    @Scheduled(fixedRate = 3000, initialDelay = 500)
    public void reportCacheEvict() {
        System.err.println("Flush Cache " + new Date());
        Region<String, String> region = cache.getRegion("Cache");
        Set<String> keySet = region.keySetOnServer();
        region.removeAll(keySet);
    }
}
