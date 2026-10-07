package com.exemplo.loja.model;

import java.io.Serializable;
import java.util.Objects;

public class ItemPedidoId implements Serializable {

    private Integer pedido;
    private Integer produto;

    public ItemPedidoId() {
    }

    public ItemPedidoId(Integer pedido, Integer produto) {
        this.pedido = pedido;
        this.produto = produto;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

    public Integer getProduto() {
        return produto;
    }

    public void setProduto(Integer produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemPedidoId)) return false;

        ItemPedidoId that = (ItemPedidoId) o;

        return Objects.equals(pedido, that.pedido)
                && Objects.equals(produto, that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedido, produto);
    }
}