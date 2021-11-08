package com.core.back.controllers.contract;

import com.core.back.controllers.dto.UniversityDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface IUniversidad {
    @GetMapping("/list")
    @Operation(description = "Listado de universidades disponibles en el sistema")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = UniversityDTO.class)))),
            @ApiResponse(responseCode = "204", description = "No Hay Contenido"),
            @ApiResponse(responseCode = "500", description = "Error Interno", content = @Content(array = @ArraySchema(schema = @Schema(implementation = String.class)))),
    })
    @Parameters(value = {
            @Parameter(name = "sim parametros")
    })
    public ResponseEntity<?> getUniversidades();

    @PostMapping("/create/{name}/{descripcion}")
    @Operation(description = "Agrega una nueva institución en el sistema")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "CREATED", content = @Content(array = @ArraySchema(schema = @Schema(implementation = UniversityDTO.class)))),
            @ApiResponse(responseCode = "204", description = "No Hay Contenido"),
            @ApiResponse(responseCode = "500", description = "Error Interno", content = @Content(array = @ArraySchema(schema = @Schema(implementation = String.class)))),
    })
    @Parameters(value = {
            @Parameter(name = "name", description = "Nombre de la institución académica", example = "Universidad Catolica de las Casas"),
            @Parameter(name = "descripcion", description = "Descripción de la institución académica", example = "Descripción breve de la institución"),
    })
    public ResponseEntity<?> create(UniversityDTO universityDTO);

    @PutMapping("/update/{id}/{name}/{descripcion}")
    @Operation(description = "Agrega una nueva institución en el sistema")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = UniversityDTO.class)))),
            @ApiResponse(responseCode = "204", description = "No Hay Contenido"),
            @ApiResponse(responseCode = "500", description = "Error Interno", content = @Content(array = @ArraySchema(schema = @Schema(implementation = String.class)))),
    })
    @Parameters(value = {
            @Parameter(name = "id", description = "primary key del registro a actualizar", example = "1"),
            @Parameter(name = "name", description = "Nombre de la institución académica", example = "Universidad Catolica de las Casas"),
            @Parameter(name = "descripcion", description = "Descripción de la institución académica", example = "Descripción breve de la institución"),
    })
    public ResponseEntity<?> update(UniversityDTO universityDTO);

    @DeleteMapping("/delete/{id}")
    @Operation(description = "Agrega una nueva institución en el sistema")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = UniversityDTO.class)))),
            @ApiResponse(responseCode = "204", description = "No Hay Contenido"),
            @ApiResponse(responseCode = "500", description = "Error Interno", content = @Content(array = @ArraySchema(schema = @Schema(implementation = String.class)))),
    })
    @Parameters(value = {
            @Parameter(name = "id", description = "Primary Key del registro a eliminar", example = "1"),
    })
    public ResponseEntity<?> delete(int id);
}
