package Decorator;

public class BasicPedido implements IPedido{
	Almuerzo a;
	public BasicPedido(){
		a=new Almuerzo();
	}	
	@Override
	public Almuerzo assemble() {
		return a;//System.out.print("Se genero un pedido");// TODO Auto-generated method stub
		
	}

}
