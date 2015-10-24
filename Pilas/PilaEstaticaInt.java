import java.util.Scanner;

public class PilaEstaticaInt {
	int  tam; // es el tamaño del arreglo 
		//y la cantidad maxima de elementos
		// que puede guardar.
	int tope = -1; // es la posicion del elemento
		//proximo a salir y el ultimo que se guardo
		// inicialmente el valor es de -1;
	protected int arre[] ; //el arreglo que contiene los datos.
	/**
	* El constructor
	*/
	public PilaEstaticaInt(int tamanio){
		this.tam = tamanio;
		this.arre = new int[this.tam];
	}
	/* empty */
	public boolean empty() {
		return (this.tope == -1);
	}
	/* push devuelve true si pudo insertar,false en caso contrario*/
	public boolean push(int n) {
		if((this.tope +1) == this.tam) {
			return false;
		}
		this.arre[++this.tope] = n;
		return true;
	}
	public int pop() {
		if(this.empty()) { //error
			return -1;
		}
		return this.arre[this.tope--];
	}
	
	public String toString(){
		if(this.empty()){
			return "vacia";
		}
		String out = "";
		for(int i=0; i<=this.tope; i++) {
			out += "[" + this.arre[i]+ "] ->";
		}
		return out + "<-Tope(" + this.tope + ")";
	}
	public static void main(String[] argumentos) {
		PilaEstaticaInt p = new PilaEstaticaInt(5);
		int opc;
		Scanner  sc = new Scanner(System.in);
		do{
			System.out.println("Menu");
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
