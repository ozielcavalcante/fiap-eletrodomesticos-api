package monitorenergia.eletrodomesticosapi.dtos;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record EletrodomesticoDTO(
        @NotBlank String nome,
        String marca,
        String modelo,
        Integer potencia,
        @Future LocalDate validadeGarantia
) {
}
