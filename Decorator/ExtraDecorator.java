package Decorator;

import catalogo.Platillo;

public class ExtraDecorator extends PedidoDecorator{
	String s;
	public ExtraDecorator(IPedido i,Platillo p) {
		super(i);
		this.s=p.getNombre();
		// TODO Auto-generated constructor stub
	}
	public Almuerzo assemble() {
		return super.assemble().setExtra(s);
		
		
	}
	public ExtraDecorator(IPedido i,String s) {
		super(i);
		this.s=s;
		// TODO Auto-generated constructor stub
	}

}