package com.ale.filialapi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ale.filialapi.domain.Filial;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Integer> {


}
