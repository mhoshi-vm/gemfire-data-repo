package com.example.gemfirelookasidecache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.EnableCachingDefinedRegions;

/**
 *
 */
@SpringBootApplication
@EnableCachingDefinedRegions
public class GemfireLookAsideCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemfireLookAsideCacheApplication.class, args);
    }

}
