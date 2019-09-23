package com.tmm.myr.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tmm.myr.inventory.IService.IInventoryService;

@Controller
public class InventoryController {
	
	private static final String URL_INVENTORY = "inventory/inventoryForm";
	
	@Autowired
	private IInventoryService inventoryService;

	@RequestMapping(URL_INVENTORY)
	public String LoanMainPage(ModelMap model) {
		System.out.println("Load entrance form..");
		try {
			model.addAttribute("inventoryList", inventoryService.getAll());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return URL_INVENTORY;
	}
}
