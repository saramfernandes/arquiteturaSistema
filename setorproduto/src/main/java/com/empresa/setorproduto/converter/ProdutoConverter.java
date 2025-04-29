package com.empresa.setorproduto.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.empresa.setorproduto.dto.ProdutoDto;
import com.empresa.setorproduto.entities.Produto;

@Component
public class ProdutoConverter {

    public ProdutoDto toDto(Produto produtoListado) {
        return new ProdutoDto(produtoListado.getNome());
    }

    public List<ProdutoDto> toDto(List<Produto> produtoListados) {
        List<ProdutoDto> produtoDtos = new ArrayList<ProdutoDto>();
        for (Produto produto : produtoListados) {
            produtoDtos.add(new ProdutoDto(produto.getNome()));
        }
        return produtoDtos;
    }
}
