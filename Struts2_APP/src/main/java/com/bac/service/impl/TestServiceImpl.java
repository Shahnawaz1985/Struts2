package com.bac.service.impl;

import com.bac.service.TestService;


public class TestServiceImpl implements TestService {

	@Override
	public void doService() {
		System.out.println("Test Service :: doService() method.");		
	}

}
