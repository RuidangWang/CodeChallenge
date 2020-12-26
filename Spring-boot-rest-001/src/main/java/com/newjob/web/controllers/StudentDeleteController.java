package com.newjob.web.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newjob.beans.StudentRegistration;

@Controller
public class StudentDeleteController {
	
	@RequestMapping(method = RequestMethod.DELETE, value ="/delete/student/{RegNum}")
	
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("RegNum") String regNum) {
		System.out.println("In deletion a student with regNum = "+regNum );
		return StudentRegistration.getInstance().deleteStudent(regNum);
	}

}
