package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Main1;
import com.example.demo.repository.Main1Repository;

@Service
public class Main1ServiceImpl {
	@Autowired
	private Main1Repository main1Repository;

	public Main1ServiceImpl(Main1Repository main1Repository) {
		this.main1Repository = main1Repository;
	}

	public Main1 save(Main1 users) {
		return main1Repository.save(users);
		
	}
	
//	public Iterable<Main1> list() {
//        return main1Repository.findAll();
//    }

//    public Iterable<Main1> save(List<Main1> users) {
//        return main1Repository.save(users);
//    }
	
}
