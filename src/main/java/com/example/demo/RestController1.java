package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {
@RequestMapping("emp")
	public List<Employee> getEmployees()
	{
		List<Employee> emp=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setFname("RAHUL");
		e1.setLname("G");
		e1.setPhone("8324384348");
		e1.setEmail("rahul.g@gmail.com");
		e1.setPassword("Biscuit");
		
		Employee e2=new Employee();
		e2.setFname("Chiranjeevi");
		e2.setLname("Babu");
		e2.setPhone("23423552525");
		e2.setEmail("chiranjeevibabu@gmail.com");
		e2.setPassword("chocolate");
		
		emp.add(e1);
		emp.add(e2);
	
		return emp;
		
	}
	
}
