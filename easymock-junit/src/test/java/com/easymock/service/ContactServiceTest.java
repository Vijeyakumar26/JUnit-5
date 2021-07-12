package com.easymock.service;

import static org.junit.gen5.api.Assertions.assertNotNull;

import org.junit.gen5.api.Test;

public class ContactServiceTest {
	
	@Test
	public void testGetNameById_01() {
		ContactService contactService = new ContactServiceImpl();
		
		String nameById = contactService.getNameById(101);
		
		assertNotNull(nameById);
	}
}
