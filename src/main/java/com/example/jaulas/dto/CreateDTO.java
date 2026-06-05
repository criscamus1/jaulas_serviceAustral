package com.example.jaulas.dto;

import jakarta.validation.constraints.*;


public record CreateDTO(
    @NotNull(message = "El ID no puede quedar vacio")@Positive(message = "El ID del centro debe ser un número positivo")
    Integer centroId,

    @NotBlank(message = "El código de la jaula es obligatorio")
    String codigoJaula
) {}
