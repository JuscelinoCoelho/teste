package br.com.hdi.teste.api.controller;

import br.com.hdi.teste.api.client.dto.CorretorDadosDto;
import br.com.hdi.teste.api.controller.dto.CorretorDto;
import br.com.hdi.teste.api.controller.dto.MensagemDto;
import br.com.hdi.teste.api.service.HdiService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping
@Tag(name = "corretor")
public class HdiController {

	private final HdiService hdiService;

    @Autowired
    public HdiController(HdiService hdiService) {
        this.hdiService = hdiService;
    }

    @GetMapping("/dados/{documento}")
    public Optional<Object> dadosCorretor(@PathVariable String documento) {

        Optional<CorretorDadosDto> dados = this.hdiService.dadosCorretor(documento);
        
        if (dados.isEmpty()) {
        	
        	Optional<MensagemDto> erro = Optional.of(new MensagemDto("erro de negócio"));
        	//return erro.map(negocio -> ResponseEntity.ok().body(negocio.getErroNegocio()));
        	return erro.map(negocio -> ResponseEntity.ok().body(new MensagemDto(negocio.getErroNegocio())));
        }
        
        return dados.map(corretor -> ResponseEntity.ok().body(new CorretorDto(corretor)));
        
    }
    
    
}
