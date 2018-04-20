package org.acs.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class HelloController {
	
	@Value("${port}")
	String port;
	
	@Value("${foo}")
	String foo;
	
	@RequestMapping("/hello")
	public String hello(){
		return foo;
	}
}
