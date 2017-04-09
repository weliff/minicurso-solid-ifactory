package br.com.ifactory.solid.impresora;

public class ImpresoraEpson implements Impresora {
	
	@Override
	public String imprimir(String documento) {
		System.out.println("Imprimindo pedido >>>>>>> " + documento);
		return "Impres�o preto e branco";
	}

}
