package com.example.onetomany;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.entity.MobileNumber;
@Repository
public interface MobileRepository extends CrudRepository<MobileNumber, Integer> 
{
}
