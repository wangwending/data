package com.wwd.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wwd.mapper.StudentMapper;
import com.wwd.model.Student;

/**
 * 
		* ClassName: StudentTest <br/>
		* Function: Student测试. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
public class StudentTest extends BaseTest {

	private static final Logger log = LoggerFactory.getLogger(StudentTest.class);

	@Autowired
	private StudentMapper studentMapper;

	@Test
	public void info() {
		Student student = studentMapper.selectByPrimaryKey(1);
		log.info("select Student Success info {} {} {} {}", student.getId(), student.getName(), student.getAge(),
				student.getSex());
	}
	
	@Test
	public void add() {
		Student student = new Student();
		student.setId(3);
		student.setAge(18);
		student.setName("李倩");
		student.setSex("女");
		int i = studentMapper.insert(student);
		log.info("add Success !!! {}", i);
	}
}
