import java.util.HashMap;
import java.util.Scanner;

public class CreacionHashMap {

	static Scanner scn = new Scanner(System.in);

	static String ok = "";

	static String dato = "";
	
	static String datoReemplazo = "";
	
	static String[] myArray = { "Frutos", "39113098", "Masculino", "CDA" };
	static String[] myArrayNew = { "Frutos", "39113098", "Masculino", "CDA" };
	
	static HashMap<String, String[]> mapa = new HashMap<String, String[]>();
	
	public static HashMap<String, String[]> Creacion() {

		mapa.put("Federico", myArray);

		for (int j = 0; j < myArray.length; j++) {

			System.out.println(mapa.get("Federico")[j] + "\n");
		}

		System.out.println("Desea modificar algun dato? [s/n]");
		ok = scn.nextLine();
		if (ok.equals("s") || ok.equals("S")) {
			Modificar();
		}

		return mapa;

	}

	public static void Modificar() {
		System.out.println("Que dato desea modificar?");
		
		dato = scn.nextLine();
		
		System.out.println("Con que desea reemplazarlo?");
		
		datoReemplazo = scn.nextLine();
		
		myArray = myArrayNew;
		
		for (int i = 0; i < myArray.length; i++) {
			 
			if (myArray[i].equals(dato)) {
				myArrayNew[i] = datoReemplazo;
				mapa.replace("Federico", myArrayNew);
				System.out.println("Datos Actualizados con exito!\n");
			}
		}
		
		Creacion();
		

	}

}
