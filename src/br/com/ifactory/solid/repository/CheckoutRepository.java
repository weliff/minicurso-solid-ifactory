package br.com.ifactory.solid.repository;

import br.com.ifactory.solid.model.Pedido;

public class CheckoutRepository {

	
	public Pedido salvar(Pedido pedido) {
		pedido.setId(123L);
		return pedido;
	}
	
}
