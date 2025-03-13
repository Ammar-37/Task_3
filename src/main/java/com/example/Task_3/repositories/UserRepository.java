package com.example.Task_3.repositories;

import com.example.Task_3.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
