package org.acs.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 服务提供者
 */
@SpringCloudApplication
public class SpringCloudEurekaProviderApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCloudEurekaProviderApplication.class, args);
    }
}
