import java.util.Arrays;
import java.util.Scanner;

public class EjCiudades {

	public static void main(String[] args) {
		// Fase 1
		String ciudadUno, ciudadDos, ciudadTres, ciudadCuatro, ciudadCinco, ciudadSeis = null;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce los nombres de las ciudades: ");
		// Barcelona Madrid Valencia Malaga Cadis Santander
		ciudadUno = in.next();
		ciudadDos = in.next();
		ciudadTres = in.next();
		ciudadCuatro = in.next();
		ciudadCinco = in.next();
		ciudadSeis = in.next();
		in.close();
		System.out.println(ciudadUno + " " + ciudadDos + " " + ciudadTres + " " + ciudadCuatro + " " + ciudadCinco + " " + ciudadSeis);
		
		
		// Fase 2
		String[] arrayCiudades = {ciudadUno, ciudadDos, ciudadTres, ciudadCuatro, ciudadCinco, ciudadSeis};
		Arrays.sort(arrayCiudades);
		System.out.println(Arrays.toString(arrayCiudades));
		
		
		// Fase 3
		String[] arrayCiudadesModif = new String[6];
		for (int i=0; i < arrayCiudades.length; i++) {
			if (arrayCiudades[i].contains("a")) {
				arrayCiudadesModif[i] = arrayCiudades[i].replace("a", "4");
			}
		}
		System.out.println(Arrays.toString(arrayCiudadesModif));
		
		
		// Fase 4
		
		String[] arrBarcelona = ciudadUno.split("");
		String[] arrMadrid = ciudadDos.split("");
		String[] arrValencia = ciudadTres.split("");
		String[] arrMalaga = ciudadCuatro.split("");
		String[] arrCadis = ciudadCinco.split("");
		String[] arrSantander = ciudadSeis.split("");

		
//		String[] arrayBarcelona = new String[9];
//		arrayBarcelona[0] = "B";
//		arrayBarcelona[1] = "a";
//		arrayBarcelona[2] = "r";
//		arrayBarcelona[3] = "c";
//		arrayBarcelona[4] = "e";
//		arrayBarcelona[5] = "l";
//		arrayBarcelona[6] = "o";
//		arrayBarcelona[7] = "n";
//		arrayBarcelona[8] = "a";
//		
//		String[] arrayMadrid = new String[6];
//		arrayMadrid[0] = "M";
//		arrayMadrid[1] = "a";
//		arrayMadrid[2] = "d";
//		arrayMadrid[3] = "r";
//		arrayMadrid[4] = "i";
//		arrayMadrid[5] = "d";
//		
//		String[] arrayValencia = new String[8];
//		arrayValencia[0] = "V";
//		arrayValencia[1] = "a";
//		arrayValencia[2] = "l";
//		arrayValencia[3] = "e";
//		arrayValencia[4] = "n";
//		arrayValencia[5] = "c";
//		arrayValencia[6] = "i";
//		arrayValencia[7] = "a";
//		
//		String[] arrayMalaga = new String[6];
//		arrayMalaga[0] = "M";
//		arrayMalaga[1] = "a";
//		arrayMalaga[2] = "l";
//		arrayMalaga[3] = "a";
//		arrayMalaga[4] = "g";
//		arrayMalaga[5] = "a";
//		
//		String[] arrayCadis = new String[5];
//		arrayCadis[0] = "C";
//		arrayCadis[1] = "a";
//		arrayCadis[2] = "d";
//		arrayCadis[3] = "i";
//		arrayCadis[4] = "s";
//		
//		String[] arraySantander = new String[9];
//		arraySantander[0] = "S";
//		arraySantander[1] = "a";
//		arraySantander[2] = "n";
//		arraySantander[3] = "t";
//		arraySantander[4] = "a";
//		arraySantander[5] = "n";
//		arraySantander[6] = "d";
//		arraySantander[7] = "e";
//		arraySantander[8] = "r";
		
		String[][] arrCiudades = {arrBarcelona, arrMadrid, arrValencia, arrMalaga, arrCadis, arrSantander};
		
		for (String[] arr : arrCiudades) {
			int length = arr.length - 1;
			System.out.print(" ");
			for (int i = length; i >= 0; i--) {
				System.out.print(arr[i]);
			}
		}
		
		
	}	
}
