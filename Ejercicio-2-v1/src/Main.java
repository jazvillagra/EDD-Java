
public class Main {

	public static void main(String[] args) {
		//Instanciamos un objeto de tipo ReadFile
		ReadFile file = new ReadFile();
		
		int firstFile = file.compare("/home/jvillagra/input.txt");
		int secondFile = file.compare("/home/jvillagra/blabla.txt");
		
		if(firstFile != 0 && secondFile != 0){
			System.out.println("El TestSum del primer archivo es: "+firstFile);
			System.out.println("El TestSum del segundo archivo es: "+secondFile);
		
			if (firstFile==secondFile){
				System.out.println("Los archivos son iguales");
			}else{
				System.out.println("Los archivos NO son iguales");
			}
		}
		
	}

}