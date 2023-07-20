package com.viniciusv.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viniciusv.workshopmongo.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
