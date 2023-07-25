package com.viniciusv.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viniciusv.workshopmongo.entities.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
