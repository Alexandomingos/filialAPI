package com.ale.filialapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ale.filialapi.domain.Filial;
import com.ale.filialapi.repositories.FilialRepository;

@SpringBootApplication
public class FilialApplication implements CommandLineRunner {

	@Autowired
	private FilialRepository filialRepository;

	public static void main(String[] args) {
		SpringApplication.run(FilialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Filial f1 = new Filial(null, "21","1401","VD", "854512600008575"," Rio de Janeiro Casas Bahia", "Avenida Brasil", "4585","Aterro do Flamengo","Pão de Açucar", "Rio de Janeiro","SP","43258-260",null,"1401",null);
		Filial f2 = new Filial(null, "21","1200","VD", "330412600001645","Casas Bahia Jundiaí Leve", "Rod. Anhanguera", "km 52","Bairro Castanho","KM 52 + 350M", "Jundiaí","SP","13203-850",null,"1200",null );
		
		filialRepository.saveAll(Arrays.asList(f1, f2));
		
	}

}
