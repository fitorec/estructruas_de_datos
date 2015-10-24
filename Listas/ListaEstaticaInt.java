import java.util.Scanner;

public class ListaEstaticaInt {
	/** Contiene el número de elementos existentes */
	int num_elementos;
	/** contiene los datos de la lista */
	protected int datos[];
	/** el constructor recibe el tamaño*/
	public ListaEstatica(int tamMaximo) {
		this.datos = new int[tamMaximo];
		this.num_elementos = 0;
	}
	/*** devuelve true si lo pudo insertar */
	public boolean insert(int pos, int val) {
		if (this.num_elementos == this.datos.length) {
			return false;
		}
		for(int i=this.num_elementos -1; i>=pos; i--) {
			this.datos[i+1] = this.datos[i];
		}
		this.datos[pos] = val;
		this.num_elementos++;
		return true;
	}// end insert

	public int extract(int pos) {
		if(pos>=this.num_elementos) {
			System.out.println("Error al extraer indice invalido");
			return -1;
		}
		int val = this.datos[pos];
		for(int i=pos; i<this.num_elementos-1; i++) {
			this.datos[i] = this.datos[i+1];
		}
		this.num_elementos--;
		return val;
	}//extract
	public String toString() {
		String out = "";
		for(int i=0; i<this.num_elementos; i++) {
			out += "[" + this.datos[i] + "]";
		}
		for(int i=this.num_elementos; i<this.datos.length; i++) {
			out += "[X]";
		}
		return out;
	}
	public static void main(String args[]) {
		ListaEstaticaInt list = new ListaEstaticaInt(10);
		Scanner sc = new Scanner(System.in);
		int opc = 0, val, pos;
		do {
			System.out.println("Menu de la lista");
			System.out.println("     1.- Insertar");
			System.out.println("     2.- Extraer");
			System.out.println("     3.- Salir");
			opc = sc.nextInt();
			switch(opc) {
				case 1:
				System.out.println("La posición:");
				pos = sc.nextInt();
				System.out.println("El valor:");
				val = sc.nextInt();
				list.insert(pos, val);
				break;
				case 2:
				System.out.println("La posición:");
				pos = sc.nextInt();
				val = list.extract(pos);
				System.out.println("Valor extraido :" + val);
				break;
			} //end switch
			System.out.println(list);
		} while(opc != 3);
	}// end main
}// end class
