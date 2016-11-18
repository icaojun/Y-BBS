package com.ssh.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.bean.Student;
import com.ssh.dao.StudentDao;
import com.ssh.service.StudentService;

@Service("StudentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	@Override
	public void add(Student student) {
		studentDao.add(student);
	}
	

}
