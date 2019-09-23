package com.tmm.myr.imexMyR.Service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tmm.myr.imexMyR.IService.IMyrService;

public class MyRServiceTest {
	
	@Autowired
	private MyRService service;

	@Test
	public void testGetHistory() {
		try {
			System.out.println("Ejecutando test");
			service.getHistory(1022, 21);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
}
