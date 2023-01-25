package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Signature;

public interface SignatureRepository extends MongoRepository<Signature,String>{
	public Signature getById(String id);

}
