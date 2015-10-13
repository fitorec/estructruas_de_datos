
import java.util.Scanner;

public class Cola implements ColaInterfas {
	protected Nodo entrada = null, aux = null;

	/**
	 * Se encarga de agregar un nuevo elemento en el entradae de la Cola
	 * 
	 * @param nodo El nuevo nodo a agregar en la Cola
	 */
	public void insert(int n) {
		Nodo nuevo = new Nodo(n);
		nuevo.next = this.entrada;
		this.entrada = nuevo;
	}

	/**
	 * Devuelve true cuando la Cola se encuentra vacia
	 * 
	 * @return true si la Cola esta vacia
	 */
	public boolean empty() {
		return (this.entrada == null);
	}

		/**
	 * Se encarga de devolver el elemento del entradae de la Cola
	 * 
	 * @return entradae
	 */
	public int extract() {
		//Por implementar
		return 0;
	}
	
	public int peek() {
		//Por implementar
		return 0;
	}

	public String toString() {
		if (this.empty()) {
			return "Cola vacia";
		}
		aux = this.entrada;
		//Por implementar
		return "";
	}

	/**
	 * Crea una lista y probar su funcionamiento
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Cola Cola = new Cola();
		int e, opc;
		String cadena;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println ("Prueba Cola");
			System.out.println ("---------------------------");
			System.out.println ("1. Insert");
			System.out.println ("2. Extract");
			System.out.println ("3. Salir");
			System.out.println ("\n");
			opc = scanner.nextInt();
			switch (opc) {
				case 1:
					System.out.println ("Dame el valor:");
					Cola.insert(scanner.nextInt());
					break;
				case 2:
					System.out.println ("Elemento extraido: [" + Cola.extract() + "]");
			}
			System.out.println(Cola);
		} while (opc != 3);
	}
}
