package br.com.ifactory.solid.controller;

import br.com.ifactory.solid.impresora.Impresoras;
import br.com.ifactory.solid.model.Pedido;
import br.com.ifactory.solid.service.CheckoutService;

public class CheckoutController {
	
	private CheckoutService service;
	
	public CheckoutController() {
		service = new CheckoutService(Impresoras.impresoraColorida());
	}
	
	public void finalizar(Pedido pedido) {
		service.finalizar(pedido);
	}
	
	public static void main(String[] args) {
		CheckoutController c = new CheckoutController();
		c.finalizar(new Pedido(null, "Weliff", "compra-Weliff.pdf"));
	}
}
