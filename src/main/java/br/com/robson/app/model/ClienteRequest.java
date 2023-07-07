package br.com.robson.app.model;

import java.util.ArrayList;
import java.util.List;

public class ClienteRequest   {
  private String id;

  private String nome;

  private String sobrenome;

  private String email;

  private SexoEnum sexo;
  
  private String datanascimento;

  private List<EnderecoRequest> enderecos = new ArrayList<>();

  private List<TelefoneRequest> telefones = new ArrayList<>();

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public SexoEnum getSexo() {
	return sexo;
}

public void setSexo(SexoEnum sexo) {
	this.sexo = sexo;
}

public String getDatanascimento() {
	return datanascimento;
}

public void setDatanascimento(String datanascimento) {
	this.datanascimento = datanascimento;
}

public List<EnderecoRequest> getEnderecos() {
	return enderecos;
}

public void setEnderecos(List<EnderecoRequest> enderecos) {
	this.enderecos = enderecos;
}

public List<TelefoneRequest> getTelefones() {
	return telefones;
}

public void setTelefones(List<TelefoneRequest> telefones) {
	this.telefones = telefones;
}
  
}

