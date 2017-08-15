package Decorator;

import catalogo.Platillo;

public class SopaDecorator extends PedidoDecorator{
	Platillo p;
	public SopaDecorator(IPedido i,Platillo p) {
		super(i);
		this.p=p;
		// TODO Auto-generated constructor stub
	}
	public Almuerzo assemble() {
		return super.assemble().setSopa(p.getNombre());
		
		
	}

}
