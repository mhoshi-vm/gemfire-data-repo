package com.example.gemfirelookasidecache;


import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
class DemoService {

  DemoRepository demoRepository;

  public DemoService(DemoRepository demoRepository) {
    this.demoRepository = demoRepository;
  }

  @Cacheable("Cache")
  public List<DemoRecord> getter() {
    System.err.println("Hitting backing store " + new Date());
    return demoRepository.findAll();
  }

  @CachePut(cacheNames = "Cache", key = "#id")
  public void setter(Integer id, String aaa) {
    demoRepository.save(new DemoRecord(id, aaa));
  }

  @CacheEvict(allEntries = true, value = "Cache")
  @Scheduled(fixedRate = 20000, initialDelay = 500)
  public void reportCacheEvict() {
    System.err.println("Flush Cache " + new Date());
  }
}
