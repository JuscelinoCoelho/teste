
package br.com.hdi.teste.api.controller.dto;

import br.com.hdi.teste.api.client.dto.CorretorDadosDto;

public class CorretorDto {

    private String name;
    private String document;
    private String code;
    private String createDate;
    private String commissionRate;
    private String status;

    public CorretorDto(CorretorDadosDto corretorDadosDto) {
    	this.name = corretorDadosDto.getName();
    	this.document = corretorDadosDto.getDocument();
    	this.code = corretorDadosDto.getCode();
    	this.createDate = corretorDadosDto.getCreateDate();
    	this.commissionRate = corretorDadosDto.getCommissionRate();
    	this.status = corretorDadosDto.getStatus();
    }


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
