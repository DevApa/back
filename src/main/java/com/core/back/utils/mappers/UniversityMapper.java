package com.core.back.utils.mappers;

import com.core.back.controllers.dto.UniversityDTO;
import com.core.back.repository.model.University;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public final class UniversityMapper {

    public static final UniversityDTO universityToUniversityDTO(University university) {
        return new ModelMapper().map(university, UniversityDTO.class);
    }

    public static final University universityDTOToUniversity(UniversityDTO universityDTO) {
        return new ModelMapper().map(universityDTO, University.class);
    }

    public static final List<UniversityDTO> lUniversityDTO(List<University> lUniversity) {
        return lUniversity.stream().map(UniversityMapper::universityToUniversityDTO).collect(Collectors.toList());
    }

    public static final List<University> lUniversity(List<UniversityDTO> lUniversityDTO) {
        return lUniversityDTO.stream().map(UniversityMapper::universityDTOToUniversity).collect(Collectors.toList());
    }
}
