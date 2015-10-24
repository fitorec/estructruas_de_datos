import java.util.Scanner;

public class PilaInt implements PlantillaPila {
	protected NodoInt top = null;

	public boolean empty() {
		return (this.top == null);
	}
	public void push(int n) {
		NodoInt nuevo = new NodoInt(n);
		nuevo.previo = this.top;
		this.top = nuevo;
	}
	public int pop() {
		if(this.empty()) {
			System.out.println("Error pila vacia");
			return -1;
		}
		int n = this.top.valor;
		this.top = this.top.previo;
		return n;
	}
	
	public String toString() {
		if(this.empty()) {
			return "Pila vacia";
		}
		NodoInt aux = this.top;
		String out = "[" + aux.valor + "] <- Tope";
		aux = aux.previo;
		while(aux != null) {
			out += "\n[" + aux.valor + "]";
			aux = aux.previo;
		}
		return out + "\n null";
	}
	public static void main(String[] argumentos) {
		PilaInt p = new PilaInt();
		int opc;
		Scanner  sc = new Scanner(System.in);
		do{
			System.out.println("Menu Pila dinamica");
			System.out.println("1.- Push");
			System.out.println("2.- Pop");
			System.out.println("3.- Salir");
			opc = sc.nextInt();
			switch(opc) {
				case 1:
				System.out.println("Dame un valor");
				p.push(sc.nextInt());
				break;
				case 2:
				System.out.println("extrañendo: "+ p.pop());
				break;
			}
			System.out.println(p);
		}while(opc != 3);
	}
}
