package com.nianhua.nianhuamall.coupon;

import com.nianhua.nianhuamall.coupon.CouponServiceApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = CouponServiceApplication.class)
@SpringBootTest
class CouponServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
