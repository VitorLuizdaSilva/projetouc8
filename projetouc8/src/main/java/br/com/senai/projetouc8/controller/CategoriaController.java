package br.com.senai.projetouc8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.senai.projetouc8.servico.CategoriaServico;

@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaServico servico;
	
	@GetMapping ({"/grupo", "/"})
	public String listarGrupo(Model modelo) {
		modelo.addAttribute("grupo", servico.listarCategorias());
		return "grupo"; //mostrar a página grupo.html
	}
}
