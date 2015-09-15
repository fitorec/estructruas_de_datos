import java.util.Scanner;


public class PilaEstatica {
	protected static final int tamanio = 10;
	protected int datos[], Top = -1;
	{
		this.datos = new int[PilaEstatica.tamanio];
	}
	
	public void push(int n) {
		if((this.Top +1) < PilaEstatica.tamanio) {
			this.datos[++this.Top] = n;
		}
	}
	
	public int pop() {
		if (this.Top > -1) {
			return this.datos[this.Top--];
		}
		return -1; //error
	}

	public boolean empty() {
		return this.Top<0;
	}
	
	public String toString() {
		if (this.empty()) {
			return "Pila vacia";
		}
		String out = "[tope]\n  ↓\n";
		for(int i = this.Top; i>-1; i--) {
			out += "[" + this.datos[i] +"] -> ";
		}
		return out + "NULL";
	}
	
	/**
	 * Crea una lista y probar su funcionamiento
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PilaEstatica pila = new PilaEstatica();
		int opc;
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
					System.out.println ("Dame el valor");
					pila.push(scanner.nextInt());
					break;
				case 2:
					System.out.println ("Elemento extraido: " + pila.pop());
			}
			System.out.println(pila);
		} while (opc != 3);
	}
}
