package com.cadastro.formulario.controller;


import com.cadastro.formulario.domain.CadastroFormulario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastros")
public class CadastroFormularioController {

    @GetMapping
    public CadastroFormulario getInfo(){

        CadastroFormulario cadastroFormulario = new CadastroFormulario(1L,"Rosana","35426264813", "328118242");
        return cadastroFormulario;
    }
}
