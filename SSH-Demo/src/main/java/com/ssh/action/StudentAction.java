package com.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.bean.Student;
import com.ssh.service.StudentService;

public class StudentAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -649192754528459580L;
	
	@Autowired
	private StudentService studentService;
	
	@Override
	public String execute() throws Exception {
		System.out.println(studentService);
		System.out.println("进入了Action");
		Student student = new Student();
		student.setName("aaaaa");
		System.out.println("~~~~~~~~1");
		studentService.add(student);
		System.out.println("~~~~~~~~2");
		ActionContext.getContext().put("stu", student);
		return SUCCESS;
	}
}
