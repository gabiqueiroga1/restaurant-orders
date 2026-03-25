package br.com.fiap.espb.restaurant.orders.restaurant_orders.controller;

import br.com.fiap.espb.restaurant.orders.restaurant_orders.application.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")

public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service){
        this.service = service;
    }

    @PostMapping
    public String iniciarPedido(){
        return service.iniciarPedido();
    }

    @PostMapping("/itens")
    public String adicionarItem(@RequestParam String nome,
                                @RequestParam int quantidade){
        return service.adicionarItem(nome,quantidade);
    }

    @PostMapping("/itens/remover")
    public String removerItem(@RequestParam String nome){
        return service.removerItem(nome);
    }

    @PostMapping("/confirmar")
    public String confirmar(){
        return service.confirmarPedido();
    }

    @PostMapping("/preparar")
    public String preparar() {
        return service.iniciarPreparo();
    }

    @PostMapping("/pronto")
    public String pronto() {
        return service.finalizarPreparo();
    }

    @PostMapping("/entregar")
    public String entregar() {
        return service.entregarPedido();
    }

    @PostMapping("/cancelar")
    public String cancelar() {
        return service.cancelarPedido();
    }



}
