package br.com.ifactory.solid.service;

import br.com.ifactory.solid.impresora.ImpresoraColorida;
import br.com.ifactory.solid.model.Cliente;

public class ClienteService {
	
	private ImpresoraColorida impresora;
	
	public ClienteService(ImpresoraColorida impresora) {
		this.impresora = impresora;
	}
	
	public void imprimirDados(Cliente cliente) {
		//busca documento do cliente
		impresora.imprimir("cliente123456.pdf", "red");
	}

}
