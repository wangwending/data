package com.wwd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
		* ClassName: BaseTest <br/>
		* Function: 测试基类. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:META-INF/spring/applicationContext.xml"})
public class BaseTest {
	@Test
	public void test() {

	}
}
