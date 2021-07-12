package com.easymock.service;

import com.easymock.dao.ContactDAO;

public class ContactServiceImpl implements ContactService {

	private ContactDAO contactdao;
	
	public String getNameById(Integer id) {
		
		String name = contactdao.findNameById(id);
		
		String formattedName = name.toUpperCase();
		
		return formattedName;
	}

}
