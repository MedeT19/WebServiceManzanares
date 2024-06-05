package com.tecnm.mx.Product.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tecnm.mx.Product.dto.IllustrationDto;
import com.tecnm.mx.Product.dto.IllustrationResponse;


@Service
public interface IlustrationService {
	public IllustrationResponse create(IllustrationDto illustration);
	public IllustrationResponse findOneById(UUID id);
	public List<IllustrationResponse> getAll();
}
