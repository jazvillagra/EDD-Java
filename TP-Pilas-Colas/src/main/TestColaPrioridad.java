package main;

import java.time.LocalDate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestColaPrioridad {

	//Hice cambios en todas las clases cambiando el tipo de dato de antig a Date, y el resto hice aca
	//No funciona...
	public static void main(String[] args) {
		ColaPrioridad<String> cola= new ColaPrioridad<>();
		  try {
//			  https://www.tutorialspoint.com/java/java_date_time.htm
//			  DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//			  Date today = new Date();
//			  Date todayWithZeroTime = formatter.parse(formatter.format(today));
				LocalDate ld = LocalDate.now();
				cola.agregarCliente("Juan", 2, "Defecto", ld, 'A'); 
				Date antig2=new Date(2010-12-11);
				LocalDate ld2 = LocalDate.now();
				cola.agregarCliente("Juan",3, "Defecto", ld2, 'A'); 
				Date antig3=new Date(2010-12-12);
				LocalDate ld3 = LocalDate.now();
				cola.agregarCliente("Juan", 5, "Defecto", ld3, 'A'); 
	            int n = 3;
	            for (int i=1; i<=n; i++) {
	                System.out.println("Valor " + i + ": " + cola.atenderCliente('A'));
	            }    
		  }catch (Exception e) {
			  
		}
	}
}
