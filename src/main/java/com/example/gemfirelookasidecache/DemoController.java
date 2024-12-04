package com.example.gemfirelookasidecache;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class DemoController {

    DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping
    List<DemoEntity> getter() {
        return demoService.getter();
    }

    @PostMapping
    void setter(@RequestParam String aaa) {
        demoService.setter(aaa);
    }
}
