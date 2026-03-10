package com.acheronp.forohub.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacionUsuario(
        @NotBlank(message = "El login no puede estar vacío")
        String login,

        @NotBlank(message = "La clave es obligatoria")
        String clave
) {
}
