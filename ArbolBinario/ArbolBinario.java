public class ArbolBinario{
	Nodo datos[];
	int num_elementos;

	public ArbolBinario(int numMaximo) {
		this.datos = new Nodo[numMaximo];
		this.num_elementos = 0;
	}//fin constructor
	/** agrega un elemento al arbol
	regresa true si lo pudo agregar exitosamente
	false en caso contrario */
	public boolean insert(int n) {
		if(this.num_elementos==this.datos.length){
			return false;
		}
		if(this.num_elementos == 0) {
			Nodo nuevo  = new Nodo(n);
			this.datos[0] = nuevo;
		} else {
			//en otro caso buscar posicion
			this.insertarNodo(n, 0);
		}
		this.num_elementos++;
		return true;
	} //
	public int indexOf(int n) {
		return -1;
	}
	private void insertarNodo(int n, int pos) {
		System.out.println("Intentando insertar: "+n+ " , en la pos:"+pos);
		if(this.datos[pos].valor == n){
			return;
		}
		if(this.datos[pos].valor < n){
			if(this.datos[pos].hijo_derecho ==-1) {
				Nodo nuevo = new Nodo(n);
				this.datos[pos].hijo_derecho = this.num_elementos;
				this.datos[num_elementos]= nuevo;
			} else {
				insertarNodo(n, this.datos[pos].hijo_derecho);
			}
		} else {
			if(this.datos[pos].hijo_izquierdo ==-1) {
				Nodo nuevo = new Nodo(n);
				this.datos[pos].hijo_izquierdo = this.num_elementos;
				this.datos[num_elementos] = nuevo;
			} else{
				insertarNodo(n, this.datos[pos].hijo_izquierdo);
			}
		}
	}
	public static void main(String args[]) {
		ArbolBinario ab = new ArbolBinario(5);
		ab.insert(10);
		ab.insert(15);
		ab.insert(9);
		ab.insert(5);
		ab.insert(13);
	}
}
