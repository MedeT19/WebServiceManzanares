package com.tecnm.mx.Product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnm.mx.Product.dto.IllustrationDto;
import com.tecnm.mx.Product.dto.IllustrationResponse;
import com.tecnm.mx.Product.service.IlustrationService;

@RestController
@RequestMapping(path="/illustration")
public class IllustrationController {
	@Autowired
	IlustrationService ilustrationService;
	
	 @PostMapping("")
	 IllustrationResponse newIllustration(@RequestBody IllustrationDto newIllustration) {
		 return ilustrationService.create(newIllustration);
	 }
	 
	 @GetMapping("")
		public List<IllustrationResponse> getIllustration() {
			return ilustrationService.getAll();
		}
}
