package org.acs.invoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {
	
	@Autowired
	private RemoteInterface remoteInterface;
	
	@RequestMapping("/acs/hello")
	public String hello(){
		log.info("say hello");
		return remoteInterface.hello();
	}
}
