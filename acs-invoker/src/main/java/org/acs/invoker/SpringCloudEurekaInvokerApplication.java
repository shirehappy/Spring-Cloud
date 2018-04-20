package org.acs.invoker;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 服务调用者
 */
@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudEurekaInvokerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCloudEurekaInvokerApplication.class, args);
    }
}
