package Decorator;
import catalogo.Platillo;

public abstract  class PedidoDecorator implements IPedido {
	protected IPedido i;
	//protected Almuerzo a;
	public PedidoDecorator(IPedido i) {
		this.i=i;
		//a=new Almuerzo();
	}
	public Almuerzo assemble() {
		return this.i.assemble();
		
	}


}
