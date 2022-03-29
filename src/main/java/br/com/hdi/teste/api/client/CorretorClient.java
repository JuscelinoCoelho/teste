package br.com.hdi.teste.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hdi.teste.api.client.dto.CorretorAtivoDto;
import br.com.hdi.teste.api.client.dto.CorretorDadosDto;


@FeignClient("corretorClient")
public interface CorretorClient {

    @RequestMapping("/broker/{documento}")
    CorretorDadosDto dadosCorretor(@PathVariable String documento);
    
    @RequestMapping("/brokerData/{code}")
    CorretorAtivoDto ativoCorretor(@PathVariable String code);
    
}
