package com.example.onetomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.entity.EMail;

@Repository
public interface EmailRepository extends CrudRepository<EMail, Integer>{

}
