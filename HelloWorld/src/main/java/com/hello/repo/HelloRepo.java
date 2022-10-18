package com.hello.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.pojo.HelloEntity;

@Repository
public interface HelloRepo extends JpaRepository<HelloEntity, Integer> {

}
