package br.com.ifactory.solid.model;

public class Pedido {
	
	private Long id;
	private String cliente;
	private String documento;

	public Pedido(Long id, String cliente, String documento) {
		this.id = id;
		this.cliente = cliente;
		this.documento = documento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Pedido cliente = " + this.cliente;
	}

}
