package com.example.gemfirelookasidecache;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.EnableCachingDefinedRegions;
import org.springframework.geode.config.annotation.EnableClusterAware;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableClusterAware
@EnableCachingDefinedRegions
@EnableScheduling
class DemoConfiguration {

}
