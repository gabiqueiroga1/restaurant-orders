package br.com.fiap.espb.restaurant.orders.restaurant_orders.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderItem> itens = new ArrayList<>();
    private OrderStatus status = OrderStatus.INICIADO;

    public void adicionarItem(OrderItem item) {
        if (status != OrderStatus.INICIADO){
            throw new IllegalStateException("só pode adicionar itens no início");
        }
        itens.add(item);
    }
    public void removerItem(String nome) {
        if(status != OrderStatus.INICIADO){
            throw new IllegalStateException("só pode remover itens no início");
        }
        itens.removeIf(i -> i.getNome().equals(nome));
    }

    public void confirmar(){
        if(itens.isEmpty()){
            throw new IllegalStateException("pedido sem itens");
        }
        status = OrderStatus.CONFIRMADO;
    }

    public void iniciaPreparo(){
        if(status != OrderStatus.CONFIRMADO){
            throw new IllegalStateException("pedido precisar estar confirmado");
        }
        status = OrderStatus.EM_PREPARO;
    }

    public void finalizarPreparo(){
        if (status != OrderStatus.EM_PREPARO){
            throw new IllegalStateException("pedido precisa estar em preparo");

        }
        status = OrderStatus.PRONTO;
    }

    public void entregar(){
        if(status != OrderStatus.PRONTO){
            throw new IllegalStateException("pedido não está pronto");
        }
        status = OrderStatus.ENTREGUE;
    }

    public void cancelar(){
        if (status == OrderStatus.ENTREGUE) {
            throw new IllegalStateException("pedido já entregue");
        }
        status = OrderStatus.CANCELADO;
    }

    public OrderStatus getStatus(){
        return status;
    }

    public List<OrderItem> getItens(){
        return itens;
    }
}
