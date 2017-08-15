package Decorator;
import catalogo.*;

public class Almuerzo {
public String sopa,extra,segundo;
protected IPedido i;
	public	Almuerzo(){
		sopa="Sopa: ";
		extra="extra: ";
		segundo="segundo: ";
		}

	public String toString() {
		return sopa +"\n"+segundo+"\n"+extra+"\n";
	}
	public Almuerzo setSopa(String s){
		sopa+=s;
		return this;
	}
	public Almuerzo setExtra(String s){
		extra+=s;
		return this;
	}
	public Almuerzo setSegundo(String s){
		segundo+=s;
		return this;
	}
}
