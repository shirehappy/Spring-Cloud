package org.acs.invoker.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "acs-eureka-provider")
public interface RemoteInterface {
	
	@PostMapping("/hello")
	String hello();
}
