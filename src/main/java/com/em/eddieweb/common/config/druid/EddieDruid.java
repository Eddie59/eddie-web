package com.em.eddieweb.common.config.druid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * EddieDruid class
 *
 * @author Administrator
 * @date
 */
@Configuration
@PropertySource("classpath:datasource.properties")
@ConfigurationProperties("druid.eddie.web")
public class EddieDruid extends BaseDruid{
}
