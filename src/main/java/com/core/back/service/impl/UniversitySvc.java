package com.core.back.service.impl;

import com.core.back.controllers.dto.UniversityDTO;
import com.core.back.repository.contract.IUniversityRepository;
import com.core.back.service.contract.IUniversitySvc;

import com.core.back.utils.mappers.UniversityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UniversitySvc implements IUniversitySvc {
    private static final Logger LOG = LoggerFactory.getLogger(UniversitySvc.class);
    @Autowired
    IUniversityRepository universityRepository;

    @Override
    public List<UniversityDTO> list() {
        LOG.info("Consulta universidades disponibles");
        List<UniversityDTO> listUniversity = UniversityMapper.lUniversityDTO(universityRepository.listUniversity());
        return null;
    }

    @Override
    public UniversityDTO create(UniversityDTO university) {
        return null;
    }

    @Override
    public UniversityDTO update(UniversityDTO university) {
        return null;
    }

    @Override
    public UniversityDTO delete(int id) {
        return null;
    }

    @Override
    public Boolean existUniversity(int id) {
        return null;
    }
}
