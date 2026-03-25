package br.com.fiap.espb.restaurant.orders.restaurant_orders.application;

import br.com.fiap.espb.restaurant.orders.restaurant_orders.domain.model.Order;
import br.com.fiap.espb.restaurant.orders.restaurant_orders.domain.model.OrderItem;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
    public String iniciarPedido(){
        Order pedido = new Order();
        return "pedido iniciado. Status: " + pedido.getStatus();
    }

    public String adicionarItem(String nome, int quantidade) {
        Order pedido = new Order();
        pedido.adicionarItem(new OrderItem(nome, quantidade));
        return "item adicionado: " + nome;
    }

    public String removerItem(String nome){
        Order pedido = new Order();
        pedido.removerItem(nome);
        return "item removido: " + nome;
    }

    public String confirmarPedido(){
        Order pedido = new Order();
        try{
            pedido.confirmar();
            return "pedido confirmado";
        }catch (Exception e) {
            return e.getMessage();
        }
    }

    public String iniciarPreparo() {
        Order pedido = new Order();
        try{
            pedido.iniciaPreparo();
            return "preparo iniciado";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public String finalizarPreparo(){
        Order pedido = new Order();
        try{
            pedido.finalizarPreparo();
            return "pedido pronto";
        }catch (Exception e){
            return e.getMessage();
        }
    }
    public String entregarPedido(){
        Order pedido = new Order();
        try{
            pedido.entregar();
            return "pedido entregue";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public String cancelarPedido(){
        Order pedido = new Order();
        try{
            pedido.cancelar();
            return "pedido cancelado";
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
