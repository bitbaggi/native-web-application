package de.markant.mnet.example.examplenativeservice;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Kessler
 **/
@Data
@Document(collection = "test-entity")
public class TestEntity {

    @Id
    private String id;

    private String firstname;
    private String lastname;
}
