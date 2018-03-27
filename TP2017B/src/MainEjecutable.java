
public class MainEjecutable {
	
	public static void main(String[] args) {
		ListaEnlazada L = new ListaEnlazada();
		L.agregarElemento("ABCDE", 20L);
		L.agregarElemento("FGHIJ", 30L);
		L.agregarElemento("KLMNO", 2L);
		
		System.out.print("\nContenido de la lista A: {\n");
		Iterador it = L.getIterador();
		while (it.hasNext()) {
			Contenedor val = it.next();
			System.out.println(val.getClave() + " " + val.getValor());
		}
		System.out.println("}\n");
		//TODO: Poner aqui la rutina que lea los valores de listaLibros, listaPrimerasLetras de los argumentos del programa
		//y luego ejecute el calculo e imprima la lista resultante en pantalla
			
	}
}
