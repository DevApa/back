package com.core.back.service.contract;

import com.core.back.controllers.dto.UniversityDTO;

import java.util.List;

public interface IUniversitySvc {
    public List<UniversityDTO> list();
    public UniversityDTO create(UniversityDTO university);
    public UniversityDTO update(UniversityDTO university);
    public UniversityDTO delete(int id);
    public Boolean existUniversity(int id);
}
