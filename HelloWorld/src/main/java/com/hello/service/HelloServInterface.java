package com.hello.service;

import java.util.List;
import java.util.Optional;

import com.hello.pojo.HelloEntity;

public interface HelloServInterface {

	HelloEntity createText(HelloEntity hc);

	List<HelloEntity> gettext();

	Optional<HelloEntity> getByID(int id);

	
}
