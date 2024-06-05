package com.tecnm.mx.Product.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tecnm.mx.Product.dto.IllustrationDto;
import com.tecnm.mx.Product.dto.IllustrationResponse;
import com.tecnm.mx.Product.entity.Illustration;
import com.tecnm.mx.Product.repository.IlustrationRepository;
import com.tecnm.mx.Product.service.IlustrationService;

@Component
public class IlustrationServiceImpl implements IlustrationService {

    @Autowired
    private IlustrationRepository ilustrationRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public IllustrationResponse create(IllustrationDto illustrationDto) {
        Illustration illustrationEntity = modelMapper.map(illustrationDto, Illustration.class);
        Illustration newIllustration = ilustrationRepository.save(illustrationEntity);
        return modelMapper.map(newIllustration, IllustrationResponse.class);
    }

    @Override
    public IllustrationResponse findOneById(UUID id) {
        return null;
    }

    @Override
    public List<IllustrationResponse> getAll() {
        List<Illustration> illustrations = ilustrationRepository.findAll();
        List<IllustrationResponse> illustrationResponses = new ArrayList<>();
        for (Illustration illustration : illustrations) {
            IllustrationResponse illustrationResponse = modelMapper.map(illustration, IllustrationResponse.class);
            illustrationResponses.add(illustrationResponse);
        }
        return illustrationResponses;
    }
}
