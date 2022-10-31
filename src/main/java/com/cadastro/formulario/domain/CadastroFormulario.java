package com.cadastro.formulario.domain;

import com.cadastro.formulario.domain.option.AreaProfissional;
import com.cadastro.formulario.domain.option.Genero;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cadastro_candidatos")
public class CadastroFormulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    /*private Date dataNascimento;*/
    /*private Genero genero;*/
    private String cpf;
    private String rg;
    /*private AreaProfissional areaProfissional;*/
   /* private byte[] anexarCurriculo;*/

}
