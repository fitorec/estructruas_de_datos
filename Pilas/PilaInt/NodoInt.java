public class NodoInt {
	public int valor; // atributo encargado de almacenar el dato
	public NodoInt previo = null; // es el enlace hacia otro
        // nodo, este nos ayuda a vincular el nodo con el 
         //  nodo inferior. En caso que no exista el nodo
         // inferior el previo va a ser null
	public NodoInt(int n) {
		this.valor = n;
	}
}
