package com.api.aula01api.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.aula01api.dto.PessoaDto;
import com.api.aula01api.entities.Pessoa;

@Component
public class PessoaConverter {

    public PessoaDto toDto(Pessoa pessoaListada) {
        return new PessoaDto(pessoaListada.getNome(), pessoaListada.getLogin());
    }
    public List<PessoaDto> toDto(List<Pessoa> pessoaListadas) {
        List<PessoaDto> pessoaDtos = new ArrayList<PessoaDto>();
        for (Pessoa pessoa : pessoaListadas) {
            pessoaDtos.add(new PessoaDto(pessoa.getNome(), pessoa.getLogin()));
        }
        return pessoaDtos;
    }
}
