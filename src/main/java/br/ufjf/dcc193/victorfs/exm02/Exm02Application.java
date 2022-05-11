package br.ufjf.dcc193.victorfs.exm02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Exm02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Exm02Application.class, args);

		 PessoaRepository rep =  ctx.getBean(PessoaRepository.class);
	}

}
