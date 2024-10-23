package com.example.gemfirelookasidecache;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class DemoService {

    DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Cacheable("Cache")
    public List<DemoRecord> getter(){
        return demoRepository.findAll();
    }

    void setter(String aaa){
        demoRepository.save(new DemoRecord(null, aaa));
    }
}
