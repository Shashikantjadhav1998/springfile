package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Fileinfo;

@Repository
public interface FileRepository extends JpaRepository<Fileinfo, Integer>{

	Fileinfo findByFname(String fname);

}
