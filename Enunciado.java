public class Enunciado{


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

	public static void menu()
	{
		/*
			Cronograma proxima semana:
				- Martes bonificaciones y notas pendientes
				- Martes asesoria por cita
				- Jueves presentación final (exposición y entrega repositorio)
				- Jueves examen final en aula digital
		*/
		int centinela = 0;

		do{
			System.out.println();
			System.out.println("Ingrese una opcion asi:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. salir");
			centinela = ConsoleInput.getInt();

			switch(centinela)
			{
				case 1: sumar();
						break;
				case 5: System.out.println("Hasta luego ;)");
						break;
				default: System.out.println("Opcion no disponible");
			}

		}while(centinela!=5);
	}

	public static void main(String[] args) {

		
		/*String banderas[] = ConsoleFile.read("recursos/info_banderas.csv");

		System.out.println("Ingrese una cadena");
		String temp = ConsoleInput.getString();
		System.out.println("La cadena leida fue:"+temp);

		System.out.println("Ingrese un numero entero");
		int entero = ConsoleInput.getInt();
		System.out.println("El entero leido fue:"+entero);

		System.out.println("Ingrese un numero flotante");
		float flotante = ConsoleInput.getFloat();
		System.out.println("El flotante leido fue:"+flotante);*/

		menu();
	}
}