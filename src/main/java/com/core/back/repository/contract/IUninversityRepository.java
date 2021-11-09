package com.core.back.repository.contract;

import com.core.back.repository.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

public interface IUninversityRepository extends JpaRepository<University, BigInteger> {
    /**
     * Para realizar consultas por filtros con fechas se pueden emplear las siguientes implementaciones
     * @Query("SELECT m FROM University m WHERE m.fecha_creacion BETWEEN :fechaInicio AND :fechaFin")
     * public List<University> listUniversityByDateCreate(@Param("fechaCreacion") Date fechaInicio, @Param("fechaFin") Date fechaFin);
     * @Query("SELECT m FROM University m WHERE m.name = :name")
     * public List<University> listUniversityByDateCreate(@Param("name") String name);
     * @return
     */
    @Query("SELECT m FROM University m")
    public List<University> list();
}
