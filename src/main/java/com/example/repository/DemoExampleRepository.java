package com.example.repository;

import com.example.entity.DemoExample;
import org.springframework.data.repository.CrudRepository;

public interface DemoExampleRepository extends CrudRepository<DemoExample, Integer> {
}
