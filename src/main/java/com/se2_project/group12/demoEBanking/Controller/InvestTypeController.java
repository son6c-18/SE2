package com.se2_project.group12.demoEBanking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.se2_project.group12.demoEBanking.Service.InvestTypeService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class InvestTypeController {
	
	@Autowired
	InvestTypeService investTypeService;
}
