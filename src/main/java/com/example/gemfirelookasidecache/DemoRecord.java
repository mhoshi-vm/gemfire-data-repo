package com.example.gemfirelookasidecache;

import org.springframework.data.annotation.Id;

record DemoRecord (
        @Id
        Integer demoId,
        String aaa
){ }
