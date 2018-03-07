import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	//declaramos un objeto del tipo BufferedReader
	private BufferedReader bf;
	
	public int compare(String dir){
		//el string text contiene las lineas leidas del archivo
		String text = "";
		/*el entero testsum contendra el valor ascii final del archivo.
		 * Si no existe, tendra el valor 0
		*/
		int testsum = 0;
		
		try {
			//instanciamos el objeto lector del archivo(escaner)
			bf = new BufferedReader(new FileReader(dir));
			//el string bfRead contendra cada linea leida del archivo
			String bfRead;
			//mientras no se llegue al final del archivo, se concatenan las lineas
			while ((bfRead = bf.readLine()) != null){
				text = text + bfRead;
			}
			//si text tiene al menos un caracter, se calcula el testsum
			if(text.length()>0){
				for (int j = 0; j < text.length(); j++) {
		            testsum += (int) text.charAt(j);
		        }
			}
		} catch (Exception e) {
			//Mensaje de error generico
			System.out.println("Ha ocurrido un error. No se pudo realizar la comparacion."+"\n");
			//Excepcion recibida
			System.err.println(e);
		}
		//retorna siempre el valor de testsum
		return testsum;
	}
}