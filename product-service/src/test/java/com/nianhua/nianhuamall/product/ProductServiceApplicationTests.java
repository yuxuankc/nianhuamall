package com.nianhua.nianhuamall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nianhua.nianhuamall.product.entity.BrandEntity;
import com.nianhua.nianhuamall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.List;


@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ProductServiceApplication.class)
@SpringBootTest
public class ProductServiceApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	public void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setName("阿里");
//		brandService.save(brandEntity);
//		System.out.println("保存成功");

//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setBrandId(1L);
//		brandEntity.setDescript("阿里");
//		brandService.updateById(brandEntity);

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		list.forEach(System.out::println);
	}

}
