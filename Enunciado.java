import java.util.*;
import java.util.Arrays; 

public class Enunciado{

	//Decoracion con ascii art
	//Funcion que permita imprimir caracteres del español, ejemplo ñ

	public static void sumar()
	{
		float a,b,c;

		System.out.println(":: Suma ::");
		System.out.println("Ingrese a");
		a = ConsoleInput.getFloat();
		System.out.println("Ingrese b");
		b = ConsoleInput.getFloat();

		c = a + b;

		System.out.println("La suma es:"+c);
	}

	public static void restar()
	{
		float a,b,c;

		System.out.println(":: Resta ::");
		System.out.println("Ingrese a");
		a = ConsoleInput.getFloat();
		System.out.println("Ingrese b");
		b = ConsoleInput.getFloat();

		c = a - b;

		System.out.println("La resta es:"+c);
	}

	public static void multiplicar()
	{
		float a,b,c;

		System.out.println(":: Multiplicar ::");
		System.out.println("Ingrese a");
		a = ConsoleInput.getFloat();
		System.out.println("Ingrese b");
		b = ConsoleInput.getFloat();

		c = a * b;

		System.out.println("La multiplicacion es:"+c);
	}

	public static void division()
	{
		float a,b,c;

		System.out.println(":: Division ::");
		System.out.println("Ingrese a");
		a = ConsoleInput.getFloat();
		System.out.println("Ingrese b");
		b = ConsoleInput.getFloat();

		if(b!=0)
		{
			c = a / b;
			System.out.println("La division es:"+c);
		}
		else
		{
			System.out.println("Error division por cero");
		}

	}

	public static void imprimirFila(String fila[])
	{
		for (int i=0;i<fila.length;i++) {
			
	 		if(fila[i].equals("1"))
	 		{
	 			System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("2"))
	 		{
	 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("3"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("4"))
	 		{
	 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 		}		 		
		}
		System.out.println(ConsoleColors.RESET);
	}

	public static int subMenuSeleccionBandera(String[] banderas)
	{
		int opc = 0;

		do{
			System.out.println("Ingrese un valor entre 1 y "+banderas.length);
			opc = ConsoleInput.getIn();
		}while(opc>=1 && opc<=banderas.length);

		return opc-1;
	}

	public static void imprimirGraficoBandera(String[] banderas, int indice)
	{
		for (int i=indice;i<indice+20;i++ ) {
			imprimirFila(banderas[i].split(";"));
		}
			
	}

	public static void imprimirInformacionBandera(String[] banderas,int indice)
	{
		String fila[];

		for (int i=indice;i<indice+20;i++ ) {
			if(i == indice)
			{
				fila = banderas[i].split(";");
				System.out.println("Nombre pais: "+fila[0]);
				/*System.out.println("Capital: "+fila[1]);
				System.out.println("Idioma: "+fila[2]);*/
			}
			else{
				System.out.println(banderas[i]);
			}
		}
	}

	public static int[] desordenarArreglo(int[] array){
		Random rgen = new Random();  // Random number generator			
 
		for (int i=0; i<array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
 
		return array;
	}

	public static int[] crearIndices(int total)
	{
		int indices[] = new int[total];
		int contador = 0;
		for (int i=0;i<indices.length;i++) {
			indices[i] = contador;
			contador+=20;		
		}
		return indices;
	}

	public static void menu()
	{
		/*
			Cronograma proxima semana:
				- Martes bonificaciones y notas pendientes
				- Martes asesoria por cita
				- Jueves presentación final (exposición y entrega repositorio)
				- Jueves examen final en aula digital
		*/
		int centinela = 0, opcion_bandera = 0;
		int indices[] = crearIndices(20);
		//System.out.println(Arrays.toString(indices));
		indices = desordenarArreglo(indices);
		//System.out.println(Arrays.toString(indices));
		String banderas[] = ConsoleFile.read("recursos/info_banderas.csv");

		do{
			System.out.println();
			System.out.println("Ingrese una opcion asi:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Imprimir informacion bandera");
			System.out.println("6. Imprimir grafico bandera");
			System.out.println("7. salir");
			centinela = ConsoleInput.getInt();

			switch(centinela)
			{
				case 1:	System.out.println();
				 		sumar();
						break;
				case 2: System.out.println();
						restar();
						break;
				case 3: System.out.println();
						multiplicar();
						break;
				case 4: System.out.println();
						division();
						break;
				case 5: System.out.println();
						opcion_bandera = subMenuSeleccionBandera(banderas);
						imprimirInformacionBandera(banderas,indices[opcion_bandera]);
						break;
				case 6: System.out.println();
						opcion_bandera = subMenuSeleccionBandera(banderas);
						imprimirGraficoBandera(banderas,indices[0]);
						break;
				case 7: System.out.println("Hasta luego ;)");
						break;
				default: System.out.println("Opcion no disponible");
			}

		}while(centinela!=7);
	}

	public static void main(String[] args) {

		
		/*
		System.out.println("Ingrese una cadena");
		String temp = ConsoleInput.getString();
		System.out.println("La cadena leida fue:"+temp);

		System.out.println("Ingrese un numero entero");
		int entero = ConsoleInput.getInt();
		System.out.println("El entero leido fue:"+entero);

		System.out.println("Ingrese un numero flotante");
		float flotante = ConsoleInput.getFloat();
		System.out.println("El flotante leido fue:"+flotante);*/

		menu();//Invocavión de la función
	}
}