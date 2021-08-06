package com.junit.employee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import com.junit.Employee.Employee;
import com.junit.Employee.RestService;

public class EmployeeTest {

	Employee emp;
	RestService restService;
	
	@Before
	public void setUp() throws Exception {
		emp = new Employee();
		restService = EasyMock.createMock(RestService.class);
		ReflectionTestUtils.setField(emp, "restService", restService);
	}

	@Test
	public void test() {
		Employee employee = new Employee();
		ReflectionTestUtils.setField(employee, "id", 1);

		assertTrue(employee.getId().equals(1));
	}
	
	@Test
	public void reflectionTest()
	{
		ReflectionTestUtils.setField(emp, "restService", restService);
		assertEquals(0, 0);
	}
}


