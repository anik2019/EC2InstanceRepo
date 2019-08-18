package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class DeptController
{
    
	@Value("${name: Anik Nandy}")
    private String name;

	@GetMapping("/name")
    String getMessage() {
        return this.name;
    }

    
}


