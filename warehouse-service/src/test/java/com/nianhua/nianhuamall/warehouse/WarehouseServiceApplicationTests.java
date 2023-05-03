package com.nianhua.nianhuamall.warehouse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = WarehouseServiceApplication.class)
@SpringBootTest
class WarehouseServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
