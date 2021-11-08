package com.core.back.controllers.impl;

import com.core.back.controllers.contract.IUniversidad;
import com.core.back.controllers.dto.UniversityDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/es/universidad")
@Tag(name = "Secoed v1", description = "Capacidades de mantenimiento unversidad")
public class UniversidadControllerImpl implements IUniversidad {
    @Override
    public ResponseEntity<?> getUniversidades() {
        return null;
    }

    @Override
    public ResponseEntity<?> create(UniversityDTO universityDTO) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(UniversityDTO universityDTO) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(int id) {
        return null;
    }
}
