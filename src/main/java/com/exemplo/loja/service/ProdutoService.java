package com.exemplo.loja.service;

import com.exemplo.loja.model.Produto;
import com.exemplo.loja.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Integer id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Integer id, Produto produto) {

        Produto produtoExistente = produtoRepository.findById(id).orElse(null);

        if (produtoExistente == null) {
            return null;
        }

        produtoExistente.setNome(produto.getNome());
        produtoExistente.setPreco(produto.getPreco());
        produtoExistente.setEstoque(produto.getEstoque());
        produtoExistente.setCategoriaId(produto.getCategoriaId());

        return produtoRepository.save(produtoExistente);
    }

    public void excluir(Integer id) {
        produtoRepository.deleteById(id);
    }
}