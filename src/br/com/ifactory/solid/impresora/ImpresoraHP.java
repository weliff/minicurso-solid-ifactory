package br.com.ifactory.solid.impresora;

public class ImpresoraHP implements ImpresoraColorida {

	@Override
	public String imprimir(String documento) {
		System.out.println("Imprimindo pedido >>>>>>> " + documento);
		return "Impres�o preto e branco";
	}

	@Override
	public String imprimir(String documento, String cor) {
		System.out.println("Imprimindo pedido >>>>>>> " + documento);
		return "Impres�o colirada";
	}

}
