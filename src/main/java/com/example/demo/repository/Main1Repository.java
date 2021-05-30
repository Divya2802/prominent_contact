package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Main1;

@Repository
public interface Main1Repository extends JpaRepository<Main1,Integer>{

	//public Iterable<Main1> save(List<Main1> users);
	public Main1 save(Main1 users);
}
