package com.example.gemfirelookasidecache;

import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableCachingDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.geode.config.annotation.EnableClusterAware;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 */
@SpringBootApplication
@EnableCachingDefinedRegions
@EnableJpaRepositories(basePackageClasses = DemoRepository.class)
@EnableScheduling
@EnableClusterAware
public class GemfireLookAsideCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemfireLookAsideCacheApplication.class, args);
    }

}
