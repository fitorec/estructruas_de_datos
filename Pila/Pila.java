
import java.util.Scanner;

public class Pila implements PilaInterfas {
	protected Nodo Top = null, aux = null;

	/**
	 * Se encarga de agregar un nuevo elemento en el tope de la Pila
	 * 
	 * @param nodo El nuevo nodo a agregar en la pila
	 */
	public void push(Nodo nodo) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Se encarga de devolver el elemento del tope de la Pila
	 * 
	 * @return tope
	 */
	public Nodo pop() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Devuelve true cuando la pila se encuentra vacia
	 * 
	 * @return true si la pila esta vacia
	 */
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	public String toString() {
		String out = "[tope]\n  ↓\n";
		aux = this.Top;
		if (aux == null) {
			return "Pila vacia";
		}
		while (aux != null ) {
			out += "[" + aux.dato +"] -> ";
			aux = aux.next;
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
					String val = scanner.next("Dame elemento: ");
					pila.Push(new Nodo(val));
					break;
				case 2:
					Nodo nodo = pila.Pop();
					System.out.println ("Elemento extraido: " + nodo);
			}
			System.out.println(pila);
		} while (opc != 3);
	}
}
