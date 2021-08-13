package com.bluntsoftware.nutron.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bluntsoftware.nutron.model.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends MongoRepository<Item, String> {
}