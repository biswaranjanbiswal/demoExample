package com.example;

import com.example.entity.DemoExample;
import com.example.repository.DemoExampleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.Optional;

@SpringBootTest
@Transactional //Ensure that the test runs within a transaction
class DemoApplicationTests {
	@Autowired
	private DemoExampleRepository demoExampleRepository;

	@Test
	@Transactional
	@Rollback(false) //Disable the default rollback behavior for this test
	public void saveDemoExample() {
		DemoExample s = new DemoExample();  //create student class object
		s.setName("annu");  //using set() give value
		s.setCourse("dev");
		s.setFee(25000);

		DemoExample savedStudent = demoExampleRepository.save(s); //work as insert operation

	}

	@Test
	@Transactional
	@Rollback(false) //Disable the default rollback behavior for this test
	public void findAllDetails() {
		Iterable<DemoExample> findAll = demoExampleRepository.findAll();
		for(DemoExample demoExample : findAll){
			System.out.println(demoExample.getId());
			System.out.println(demoExample.getName());
			System.out.println(demoExample.getCourse());
			System.out.println(demoExample.getFee());
		}
	}


}
