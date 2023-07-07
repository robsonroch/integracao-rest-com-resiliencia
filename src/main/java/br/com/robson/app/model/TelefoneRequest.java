package br.com.robson.app.model;

public class TelefoneRequest   {
  private String ddd;

  private String numero;

  private TipoEnum tipo;

  private Boolean principal;

public String getDdd() {
	return ddd;
}

public void setDdd(String ddd) {
	this.ddd = ddd;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public TipoEnum getTipo() {
	return tipo;
}

public void setTipo(TipoEnum tipo) {
	this.tipo = tipo;
}

public Boolean getPrincipal() {
	return principal;
}

public void setPrincipal(Boolean principal) {
	this.principal = principal;
}

  
}

