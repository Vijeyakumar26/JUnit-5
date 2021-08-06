package com.junit.employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.junit.Employee.Employee;

public class EmployeeTest {

	Employee emp;
	
	@Before
	public void setUp() throws Exception {
		emp = new Employee();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
