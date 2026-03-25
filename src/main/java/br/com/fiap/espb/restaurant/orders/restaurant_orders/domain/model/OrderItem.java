package br.com.fiap.espb.restaurant.orders.restaurant_orders.domain.model;

public class OrderItem {
    private String nome;
    private int quantidade;

    public OrderItem(String nome,int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }
}
