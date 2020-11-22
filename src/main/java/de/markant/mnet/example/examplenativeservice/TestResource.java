package de.markant.mnet.example.examplenativeservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Kessler
 **/
@RequestMapping(path = "/api")
@RestController
public class TestResource {

    private final TestRepository testRepository;

    public TestResource(final TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping(value = "/health")
    public String getTest2() {
        return "healthy";
    }

    @GetMapping(value = "/test")
    public List<TestEntity> getTest() {
        final List<TestEntity> repoAll = this.testRepository.findAll();
        System.out.println(repoAll);
        return repoAll;
    }

    @PostMapping(value = "/test")
    public TestEntity saveTest(@RequestBody TestEntity test) {
        final TestEntity testEntity = testRepository.save(test);
        System.out.println(testEntity);
        return testEntity;
    }
}
