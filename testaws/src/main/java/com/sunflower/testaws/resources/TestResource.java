package com.sunflower.testaws.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestResource {

	@GetMapping(value = "/msg")
	public ResponseEntity<String> getMenssage() {
		String msg = "olá mundo";
		return ResponseEntity.ok().body(msg);
	}

}
