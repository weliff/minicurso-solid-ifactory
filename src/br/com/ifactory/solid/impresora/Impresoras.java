package br.com.ifactory.solid.impresora;

public class Impresoras {
	
	private static ImpresoraColorida impresoraColorida;
	private static Impresora impresora;
	
	public static ImpresoraColorida impresoraColorida() {
		if(impresoraColorida == null) {
			impresoraColorida = new ImpresoraHP();
		}
		return impresoraColorida;
	}
	
	public static Impresora impresora() {
		if (impresora == null) {
			impresora = new ImpresoraEpson();
		}
		return impresora;
	}
}
