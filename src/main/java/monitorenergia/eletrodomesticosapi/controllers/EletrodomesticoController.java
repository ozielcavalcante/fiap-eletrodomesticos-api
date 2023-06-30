package monitorenergia.eletrodomesticosapi.controllers;

import monitorenergia.eletrodomesticosapi.dtos.EletrodomesticoDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("eletrodomesticos")
public class EletrodomesticoController {

    @PostMapping
    public String novo(@RequestBody @Validated EletrodomesticoDTO eletrodomesticoDTO) {
        return "eletrodomestico OK";
    }
}
