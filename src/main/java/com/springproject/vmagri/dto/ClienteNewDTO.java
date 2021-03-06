package com.springproject.vmagri.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.springproject.vmagri.services.validation.ClienteInsert;

@ClienteInsert
public class ClienteNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Name is required.")
	@Length(min=5, max=120, message="Input 5 to 120 characters")
	private String name;
	
	@NotEmpty(message="Email is required.")
	@Email(message="Invalid Email.")
	private String email;
	
	@NotEmpty(message="CPF/CNPJ is required.")
	private String cpfOrCnpj;
	
	private Integer tipoCliente;
	
	@NotEmpty(message="Logradouro is required.")
	private String logradouro;
	
	@NotEmpty(message="Address Number is required.")
	private String numero;
	
	private String complemento;
	private String bairro;
	
	@NotEmpty(message="CEP is required.")
	private String cep;
	
	@NotEmpty(message="Telefone is required.")
	private String Tel1;
	
	private String Tel2;
	private String Tel3;
	
	private Integer cidadeId;
	
	public ClienteNewDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfOrCnpj() {
		return cpfOrCnpj;
	}

	public void setCpfOrCnpj(String cpfOrCnpj) {
		this.cpfOrCnpj = cpfOrCnpj;
	}

	public Integer getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(Integer tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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

	public String getTel1() {
		return Tel1;
	}

	public void setTel1(String tel1) {
		Tel1 = tel1;
	}

	public String getTel2() {
		return Tel2;
	}

	public void setTel2(String tel2) {
		Tel2 = tel2;
	}

	public String getTel3() {
		return Tel3;
	}

	public void setTel3(String tel3) {
		Tel3 = tel3;
	}

	public Integer getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}
}
