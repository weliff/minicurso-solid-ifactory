package br.com.ifactory.solid.service;

import br.com.ifactory.solid.impresora.Impresora;
import br.com.ifactory.solid.model.Pedido;
import br.com.ifactory.solid.repository.CheckoutRepository;
import br.com.ifactory.solid.service.exception.PedidoInvalidExcpetion;

public class CheckoutService {
	
	private Impresora impresora;
	
	private CheckoutRepository repository;
	
	public CheckoutService(Impresora impresora) {
		this.impresora = impresora;
		this.repository = new CheckoutRepository();
	}
	
	public void finalizar(Pedido pedido) {
		if(!isValidPedido(pedido)) {
			throw new PedidoInvalidExcpetion();
		}
		pedido = repository.salvar(pedido);
		impresora.imprimir(pedido.getDocumento());
	}

	private boolean isValidPedido(Pedido pedido) {
		return pedido.getId() != null;
	}
}
