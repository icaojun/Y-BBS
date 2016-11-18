package com.ssh.test;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh.bean.Student;
import com.ssh.dao.StudentDao;
import com.ssh.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class JunitTest {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private StudentDao s;
	
	@Autowired
	private StudentService s2;
	
	@Test
	public void test3(){
		Student student = new Student();
		student.setName("yjcaa");
		s2.add(student);
	}
	
	@Test
	public void test2(){
		Student student = new Student();
		student.setName("yjcaa");
		s.add(student);
	}
	
	
	@Test
	public void test(){
		Student student = new Student();
		student.setName("yjc");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
	
}
