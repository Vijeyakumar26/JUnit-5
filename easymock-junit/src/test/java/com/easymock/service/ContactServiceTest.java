package com.easymock.service;

import static org.junit.gen5.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.easymock.dao.ContactDAO;

public class ContactServiceTest {

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	public void testGetNameById_01() {
		
		ContactDAO daoProxy = EasyMock.createMock(ContactDAO.class); //Creating Mock for ContactDAO class
		
		EasyMock.expect(daoProxy.findNameById(101)).andReturn("Ashok");
		
		EasyMock.expect(daoProxy.findNameById(102)).andReturn("Anish");
		
		EasyMock.replay(daoProxy);
		
		ContactServiceImpl contactService = new ContactServiceImpl();
		
		contactService.setContactdao(daoProxy);
		
		String nameById = contactService.getNameById(101);
		
		assertNotNull(nameById);
	}

}
