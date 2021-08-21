package com.ale.filialapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ale.filialapi.domain.Filial;
import com.ale.filialapi.repositories.FilialRepository;
import com.ale.filialapi.services.exceptions.ObjectNotFoundException;

@Service
public class FilialService {

	@Autowired
	private FilialRepository repository;

	public Filial findById(Integer id) {
		Optional<Filial> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id + ", Tipo: " + Filial.class.getName()));

	}

	public List<Filial> findAll() {
		return repository.findAll();
		
	}

	public Filial update(Integer id, Filial obj) {
		Filial newObj = findById(id);
		newObj.setEmpresa(obj.getEmpresa());
		newObj.setFilial(obj.getFilial());
		newObj.setTipoAtividade(obj.getTipoAtividade());
		newObj.setCnpj(obj.getCnpj());
		newObj.setDescricao(obj.getDescricao());
		newObj.setEndereco(obj.getEndereco());
		newObj.setNumero(obj.getNumero());
		newObj.setBairro(obj.getBairro());
		newObj.setComplemento(obj.getComplemento());
		newObj.setCidade(obj.getCidade());
		newObj.setUf(obj.getUf());
		newObj.setEmpresaAbastece(obj.getEmpresaAbastece());
		newObj.setFiliaAbastece(obj.getFiliaAbastece());
		newObj.setAtividadeAbastece(obj.getAtividadeAbastece());
		return repository.save(newObj);
		
		
		
	}

	public Filial create(Filial obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public void delete(Integer id) {
	    findById(id);
	    repository.deleteById(id);
		
	}


	
	}


