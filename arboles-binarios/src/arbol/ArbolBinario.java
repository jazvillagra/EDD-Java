package arbol;

public class ArbolBinario<TipoDeDato extends Comparable<TipoDeDato>> {
	private NodoBinario raiz;
	
	public ArbolBinario() {
		raiz=null;
	}
	
	public void insertar(TipoDeDato dato) {
		raiz=privInsertar(raiz,dato);
	}
	
	public NodoBinario<TipoDeDato> buscar(TipoDeDato dato) {
		return privBuscar(raiz, dato);
	}

	public void recorridoAmplitud() {
		
	}
	public void recorridoEnOrden() {
		
	}
	public void eliminar() {
		
	}
	
	private NodoBinario privInsertar(NodoBinario<TipoDeDato> actual, TipoDeDato dato) {
		NodoBinario<TipoDeDato> nuevoNodo;
		if(actual==null) {
			nuevoNodo = new NodoBinario<>(dato);
			nuevoNodo.setDato(dato);
			return nuevoNodo;
		}else if (dato.compareTo(actual.getDato()) < 0) {
			nuevoNodo = privInsertar(actual.getIzq(), dato);
			actual.setIzq(nuevoNodo);
		}else if (dato.compareTo(actual.getDato()) > 0) {
			nuevoNodo = privInsertar(actual.getDer(), dato);
			actual.setDer(nuevoNodo);
		}
		return actual;
	}

	private NodoBinario<TipoDeDato> privBuscar(NodoBinario<TipoDeDato> N, TipoDeDato x) {
		if(N==null) {
			return null;
		}
		if (N.getDato().compareTo(x) == 0) {
			return N;
		}else if (N.getDato().compareTo(x) > 0) {
			return privBuscar(N.getIzq(), x);
		}else {
			return privBuscar(N.getDer(), x);
		}
	}
	
	
	//Metodo que hace falta arreglar para poder implementar, retorna la profunidad del nodo
	public int maxDepth(NodoBinario<Tipo> node) 
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.getIzq());
            int rDepth = maxDepth(node.getDer());
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
}