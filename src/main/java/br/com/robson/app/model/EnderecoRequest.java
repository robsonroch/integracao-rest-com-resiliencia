package br.com.robson.app.model;

public class EnderecoRequest   {
  private String logradouro;

  private String estado;

  private String municipio;

  private String bairro;

  private String cep;

  private String complemento;

  private Boolean principal;

public String getLogradouro() {
	return logradouro;
}

public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public String getMunicipio() {
	return municipio;
}

public void setMunicipio(String municipio) {
	this.municipio = municipio;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}

public String getCep() {
	return cep;
}

public void setCep(String cep) {
	this.cep = cep;
}

public String getComplemento() {
	return complemento;
}

public void setComplemento(String complemento) {
	this.complemento = complemento;
}

public Boolean getPrincipal() {
	return principal;
}

public void setPrincipal(Boolean principal) {
	this.principal = principal;
}

}

