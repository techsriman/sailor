package com.hinckley.sailor.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoEndpoint {
	@GetMapping(value = "/info.htm", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String info() {
		return "{\"sailor instanceId\": \"" + this.hashCode() + "\"}";
	}
}
