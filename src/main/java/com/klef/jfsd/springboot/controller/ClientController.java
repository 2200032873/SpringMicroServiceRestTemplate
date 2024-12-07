package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.service.APIService;

@RestController
@RequestMapping("api")
public class ClientController
{
	@Autowired
	private APIService service;
	
	@GetMapping("demo3")
	public  List<Object> demo3()
	{
		return service.displayAllProducts();	
		}


}
