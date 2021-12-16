package com.thp.spring.simplecontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.simplecontext.entity.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String>{
	

}
