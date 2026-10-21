package com.exemplo.loja.controller;

import com.exemplo.loja.model.Produto;
import com.exemplo.loja.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listar() {
        return produtoService.listar();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Integer id) {
        return produtoService.buscarPorId(id);
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(
            @PathVariable Integer id,
            @RequestBody Produto produto) {

        return produtoService.atualizar(id, produto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        produtoService.excluir(id);
    }
}