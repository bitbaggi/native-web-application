package de.markant.mnet.example.examplenativeservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Kessler
 **/
@Repository
public interface TestRepository extends MongoRepository<TestEntity, String> {
}
