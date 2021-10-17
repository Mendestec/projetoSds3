package com.devsuperior.dsvendas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.Service.SellerService;
import com.devsuperior.dsvendas.dto.SellerDTO;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
	
@Autowired
private SellerService service;
	
	@GetMapping
	public ResponseEntity<Page<SellerDTO>> findAll(Pageable pageable)
	{
		Page<SellerDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
}

