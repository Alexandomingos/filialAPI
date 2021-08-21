package com.ale.filialapi.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Filial implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty(message = "Campo EMPRESA é obrigatório")
	@Length(min = 1, max = 3, message = "Empresa tem que ter entre 1 a 3 caracteres.")
	private String empresa;

	@NotEmpty(message = "Campo FILIAL é obrigatório")
	@Length(min = 4, max = 10, message = "Filial tem que ter entre 4 a 10 caracteres")
	private String filial;

	@NotEmpty(message = "Campo TIPO DE ATIVIDADE é obrigatório")
	@Length(min = 1, max = 2, message = "Atividade tem que ter entre 1 a 2 caracteres")
	private String tipoAtividade;

	@NotEmpty(message = "Campo CNPJ é mandatório.")
	@Length(min = 15, max = 15, message = "CNPJ tem que ter 15 caracteres")
	private String cnpj;

	@Length(min = 15, max = 250, message = "Descrição tem que ter entre 15 a 250 caracteres")
	private String descricao;

	@NotEmpty(message = "Campo ENDEREÇO é mandatório.")
	@Length(min = 5, max = 70, message = "Endereço tem que ter entre 5 a 70 caracteres")
	private String endereco;

	@NotEmpty(message = "Campo NÚMERO é mandatório.")
	@Length(min = 1, max = 8, message = "Número tem que ter entre 1 a 8caracteres")
	private String numero;

	@NotEmpty(message = "Campo BAIRRO é mandatório.")
	@Length(min = 2, max = 25, message = "Bairro tem que ter entre 2 a 50 caracteres")
	private String bairro;

	@Length(min = 5, max = 25, message = "Complemento tem que ter entre 5 a 25 caracteres")
	private String complemento;

	@NotEmpty(message = "Campo CIDADE é mandatório.")
	@Length(min = 2, max = 30, message = "Cidade tem que ter entre 2 a 30 caracteres")
	private String cidade;

	@NotEmpty(message = "Campo UF é mandatório.")
	@Length(min = 2, max = 2, message = "UF tem que ter 2  caracteres")
	private String uf;

	@NotEmpty(message = "Campo CEP é mandatório.")
	@Length(min = 9, max = 9, message = "Cep tem que ter 9 caracteres")
	private String cep;

	private String empresaAbastece;

	private String filiaAbastece;

	private String atividadeAbastece;

	public Filial() {
		super();
	}

	public Filial(Integer id, String empresa, String filial, String tipoAtividade, String cnpj, String descricao,
			String endereco, String numero, String bairro, String complemento, String cidade, String uf, String cep,
			String empresaAbastece, String filiaAbastece, String atividadeAbastece) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.filial = filial;
		this.tipoAtividade = tipoAtividade;
		this.cnpj = cnpj;
		this.descricao = descricao;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.empresaAbastece = empresaAbastece;
		this.filiaAbastece = filiaAbastece;
		this.atividadeAbastece = atividadeAbastece;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public String getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmpresaAbastece() {
		return empresaAbastece;
	}

	public void setEmpresaAbastece(String empresaAbastece) {
		this.empresaAbastece = empresaAbastece;
	}

	public String getFiliaAbastece() {
		return filiaAbastece;
	}

	public void setFiliaAbastece(String filiaAbastece) {
		this.filiaAbastece = filiaAbastece;
	}

	public String getAtividadeAbastece() {
		return atividadeAbastece;
	}

	public void setAtividadeAbastece(String atividadeAbastece) {
		this.atividadeAbastece = atividadeAbastece;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filial other = (Filial) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
