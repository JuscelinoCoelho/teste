
package br.com.hdi.teste.api.controller.dto;

import br.com.hdi.teste.api.client.dto.CorretorAtivoDto;

public class AtivoDto {

	private String code;
	private String active;
    private String commissionRate;
    private String status;

    public AtivoDto(CorretorAtivoDto corretorAtivoDto) {
    	this.code = corretorAtivoDto.getCode();
    	this.active = corretorAtivoDto.getActive();
    	this.commissionRate = corretorAtivoDto.getCommissionRate();
    	this.status = corretorAtivoDto.getStatus();
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
}
