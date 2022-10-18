package com.hello.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.pojo.HelloEntity;
import com.hello.repo.HelloRepo;

@Service
public class HelloServImpl implements HelloServInterface {

	@Autowired
	HelloRepo hr;
	
	@Override
	public HelloEntity createText(HelloEntity hc) {
		// TODO Auto-generated method stub
		return hr.save(hc);
	}

	@Override
	public List<HelloEntity> gettext() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public Optional<HelloEntity> getByID(int id) {
		// TODO Auto-generated method stub
		return hr.findById(id);
	}

	
	
	
}
