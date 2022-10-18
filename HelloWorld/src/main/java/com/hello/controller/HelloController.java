package com.hello.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hello.pojo.HelloEntity;
import com.hello.service.HelloServInterface;

@RestController
public class HelloController {
	
	@Autowired
	HelloServInterface hsi;
	
	@PostMapping("/create")
	public HelloEntity createText(@RequestBody HelloEntity hc)
	{
		return hsi.createText(hc);
	}
	
	@GetMapping("/getAllText")
	public List<HelloEntity> getText()
	{
		return hsi.gettext();
		
	}
	
	@GetMapping("/getByID/{id}")
	public Optional<HelloEntity> getByID(@PathVariable int id)
	{
		return hsi.getByID(id);
		
	}
	
	
}
