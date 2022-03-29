package br.com.hdi.teste.api.service;

import br.com.hdi.teste.api.client.CorretorClient;
import br.com.hdi.teste.api.client.dto.CorretorAtivoDto;
import br.com.hdi.teste.api.client.dto.CorretorDadosDto;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HdiService {

  
    private final CorretorClient corretorClient;

    
    
    public HdiService(CorretorClient corretorClient) {
        
        this.corretorClient = corretorClient;
    }

    public Optional<CorretorDadosDto> dadosCorretor(String documento) {

      	CorretorDadosDto corretorDadosDto = this.corretorClient.dadosCorretor(documento);
      	
      	CorretorAtivoDto corretorAtivoDto = this.corretorClient.ativoCorretor(corretorDadosDto.getCode());
      	
      	if("true".equals(corretorAtivoDto.getActive())) {
      		corretorDadosDto.setCommissionRate(corretorAtivoDto.getCommissionRate());
      		corretorDadosDto.setStatus(corretorAtivoDto.getStatus());
      		return Optional.of(corretorDadosDto);
      	}
      
      	return Optional.empty();
    }
}
