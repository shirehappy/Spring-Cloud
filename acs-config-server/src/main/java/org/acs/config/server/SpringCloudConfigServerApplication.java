package org.acs.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringCloudApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringCloudConfigServerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCloudConfigServerApplication.class, args);
    }
}
