package com.hinckley.sailor.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckApiController {

	@GetMapping(value = "/healthcheck.htm", produces = { MediaType.TEXT_PLAIN_VALUE })
	@ResponseBody
	public ResponseEntity<String> healthCheck() {
		return ResponseEntity.ok("Up");
	}

}
