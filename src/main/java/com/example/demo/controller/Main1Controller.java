package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Main1;
import com.example.demo.service.Main1ServiceImpl;

@RestController
@RequestMapping("/main")
public class Main1Controller {
	@Autowired
	private Main1ServiceImpl main1ServiceImpl;

	
	public Main1Controller(Main1ServiceImpl main1ServiceImpl) {
		this.main1ServiceImpl = main1ServiceImpl;
	}


//	@GetMapping("/list")
//    public Iterable<Main1> list() {
//        return main1ServiceImpl.list();
//    }
	
}
