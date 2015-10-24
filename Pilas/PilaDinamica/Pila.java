
import java.util.Scanner;

public class Pila implements PilaInterfas {
	protected Nodo top = null, aux = null;

	/**
	 * Se encarga de agregar un nuevo elemento en el tope de la Pila
	 * 
	 * @param nodo El nuevo nodo a agregar en la pila
	 */
	public void push(int n) {
		Nodo nuevo = new Nodo(n);
		nuevo.abajo = this.top;
		this.top = nuevo;
	}

	/**
	 * Se encarga de devolver el elemento del tope de la Pila
	 * 
	 * @return tope
	 */
	public int pop() {
		if (this.empty()) {
			System.out.println("Error");
			return -1;
		}
		int n = this.top.dato;
		this.top = this.top.abajo;
		return n;
	}

	/**
	 * Devuelve true cuando la pila se encuentra vacia
	 * 
	 * @return true si la pila esta vacia
	 */
	public boolean empty() {
		return (this.top == null);
	}

	public String toString() {
		aux = this.top;
		if (aux == null) {
			return "Pila vacia";
		}
		String out = "["+this.top.dato+"] <- [tope] \n  ↓\n";
		aux = aux.abajo;
		while (aux != null ) {
			out += "[" + aux.dato +"]\n  ↓\n";
			aux = aux.abajo;
		}
		return out + "NULL";
	}

	/**
	 * Crea una lista y probar su funcionamiento
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Pila pila = new Pila();
		int e, opc;
		String cadena;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println ("Prueba pila");
			System.out.println ("---------------------------");
			System.out.println ("1. Push");
			System.out.println ("2. Pop");
			System.out.println ("3. Salir");
			System.out.println ("\n");
			opc = scanner.nextInt();
			switch (opc) {
				case 1:
					System.out.println ("Dame el valor:");
					pila.push(scanner.nextInt());
					break;
				case 2:
					System.out.println ("Elemento extraido: [" + pila.pop() + "]");
			}
			System.out.println(pila);
		} while (opc != 3);
	}
}
