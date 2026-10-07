package com.exemplo.loja.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cliente_id")
    private Integer clienteId;

    private LocalDate data;

    @Column(name = "forma_pagamento_id")
    private Integer formaPagamentoId;

    @Column(name = "status_pedido_id")
    private Integer statusPedidoId;

    @Column(name = "funcionario_id")
    private Integer funcionarioId;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;

    public Pedido() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getFormaPagamentoId() {
        return formaPagamentoId;
    }

    public void setFormaPagamentoId(Integer formaPagamentoId) {
        this.formaPagamentoId = formaPagamentoId;
    }

    public Integer getStatusPedidoId() {
        return statusPedidoId;
    }

    public void setStatusPedidoId(Integer statusPedidoId) {
        this.statusPedidoId = statusPedidoId;
    }

    public Integer getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Integer funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}