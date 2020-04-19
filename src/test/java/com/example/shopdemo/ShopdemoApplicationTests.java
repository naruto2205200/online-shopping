package com.example.shopdemo;

import com.example.shopdemo.mapper.SubMenuMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShopdemoApplicationTests {

	@Autowired
	private SubMenuMapper subMenuMapper;
	@Test
	void contextLoads() {
	}
}
