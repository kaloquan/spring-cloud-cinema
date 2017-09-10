package me.kaloquan.cinemaconsumer.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "cinema-user",configuration = RibbonConfig.class)
public class TestConfig {
}
