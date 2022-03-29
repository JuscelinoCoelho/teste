package br.com.hdi.teste.api.controller.dto;

public class MensagemDto {
	
    private String erroNegocio;
    
    public MensagemDto(String erroNegocio) {
    	this.erroNegocio = erroNegocio;
    }

	public String getErroNegocio() {
		return erroNegocio;
	}

	public void setErroNegocio(String erroNegocio) {
		this.erroNegocio = erroNegocio;
	}

}
