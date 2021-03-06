package com.guiji.cloud.registeration.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administratorn 2017/12/9.
 * Time:13:45
 * ProjectName:guiyu-cloud-registeration
 */
@Configuration
public class InstanceCancelListener implements ApplicationListener<EurekaInstanceCanceledEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(InstanceCancelListener.class);
    @Override
    public void onApplicationEvent(EurekaInstanceCanceledEvent event) {
        LOGGER.info("服务:{}挂了",event.getAppName());
    }
}
