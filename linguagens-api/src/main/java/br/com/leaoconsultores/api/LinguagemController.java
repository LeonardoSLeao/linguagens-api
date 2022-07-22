package br.com.leaoconsultores.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

	@Autowired
	private LinguagemRepository repositorio;

	@GetMapping("/linguagens")
	public List<Linguagem> obterLinguagem() {
		List<Linguagem> linguagens = repositorio.findAll();
		return linguagens;
	}

	
	@PostMapping("/linguagens")
	public Linguagem cadastrarLinguagem(@RequestBody Linguagem limguagem) {
		Linguagem linguagemSalva = repositorio.save(limguagem);
		return linguagemSalva;
	}
	

	/*
	 * private List<Linguagem> linguagens = List.of( new Linguagem("Java",
	 * "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png"
	 * ,"1"), new Linguagem("C",
	 * "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/c/c_256x256.png"
	 * ,"2") );
	 */

}
