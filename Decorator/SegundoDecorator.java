package Decorator;

import catalogo.Platillo;

public class SegundoDecorator extends PedidoDecorator{
	Platillo p;
	public SegundoDecorator(IPedido i,Platillo p) {
		super(i);
		this.p=p;
		// TODO Auto-generated constructor stub
	}
	public Almuerzo assemble() {
		return super.assemble().setSegundo(p.getNombre());
		
		
	}


}
