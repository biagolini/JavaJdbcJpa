package br.edu.ifsp.spo.contatos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contato {
    private Long id;
    private String nome;
    private String email;
    private String endereco;
    private Date nascimento;
}
