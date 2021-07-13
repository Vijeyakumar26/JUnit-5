package com.easymock.service;

import static org.junit.gen5.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	public void testGetNameById_01() {
		ContactService contactService = new ContactServiceImpl();
		
		String nameById = contactService.getNameById(101);
		
		assertNotNull(nameById);
	}

}
