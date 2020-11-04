import java.util.*;
import java.util.Arrays; 

public class Final{
	public static void main(String[] args) {

		menu();
	}

	public static void menu()
	{
		int centinela = 0, opcion_bandera = 0, validacion = 0, puntaje = 0;
		String banderas[] = ConsoleFile.read("recursos/info_banderas.csv");
		int indices[] = crearIndices(banderas.length/20);

		do{
			System.out.println();
			System.out.println("Guess the flag");
			System.out.println("Ingrese una opcion asi:");
			System.out.println("1. Iniciar juego");
			System.out.println("2. salir");
			centinela = ConsoleInput.getInt();


			switch(centinela)
			{
				case 1: 
					do{
							puntaje += 0;
							System.out.println();
							System.out.println("Ingrese una opcion asi:");
							System.out.println("1. Para empezar:");
							System.out.println("2. Salir");
							validacion = ConsoleInput.getInt();

						switch(validacion)
						{
							case 1:	boolean win = false;
									String nombre1 = null;
									String nombre2 = null;
									String nombre3 = null;
									String nombre4 = null;
									
									do{
									System.out.println("Seleccione el nombre correcto para la bandera:");
									System.out.println();
									opcion_bandera = subMenuSeleccionBandera(indices);
									imprimirGraficoBandera(banderas,indices[opcion_bandera]);
									int oportunidades = 1;
									nombre1 = banderas[indices[opcion_bandera]].split(";")[0];
									//do{
									nombre2 = banderas[indices[subMenuSeleccionBandera(indices)]].split(";")[0];
									//}while(!nombre2.equals(nombre1));
									//do{
									nombre3 = banderas[indices[subMenuSeleccionBandera(indices)]].split(";")[0];
									//}while(!nombre3.equals(nombre1));
									//do{
									nombre4 = banderas[indices[subMenuSeleccionBandera(indices)]].split(";")[0];
									//}while(!nombre4.equals(nombre1));

									int seleccion = 0;
									do{
										System.out.println("Seleccione: ");
										System.out.println();
										System.out.println("1. para: "+nombre1);
										System.out.println("2. para: "+nombre2);
										System.out.println("3. para: "+nombre3);
										System.out.println("4. para: "+nombre4);
										System.out.println("5. para salir del juego");

										seleccion = ConsoleInput.getInt();
										switch (seleccion)
										{
											case 1: if (nombre1.equals(nombre1))
													{
														win = true;
														puntaje += 1;
													}
													break;
											case 2: if (nombre2.equals(nombre1))
													{
														win = true;
														puntaje += 1;
													}
													break;

											case 3: if (nombre3.equals(nombre1))
													{
														win = true;
														puntaje += 1;
													}
													break;
											
											case 4: if (nombre4.equals(nombre1))
													{
														win = true;
														puntaje += 1;
													}
													break;
											case 5: System.out.println("Hasta luego ;)");
													System.exit(0);
													break;

											default: System.out.println("Opcion no disponible");
										}
										if (win == true)
										{
											System.out.println("Acertaste esta selección");
											System.out.println("Tu puntaje es: "+puntaje);
											System.out.println();

											break;
										}
										else
										{
											System.out.println("No acertaste esta selección");
											System.out.println();
											oportunidades += 1;
										}
									} while(oportunidades<=3);

									if (oportunidades > 3)
									{
										System.out.println("Perdiste men :(");
										System.out.println("Tu puntaje final es: "+puntaje);
									}

								} while(win == true);
								break;
							case 2: System.out.println("Hasta luego ;)");
									System.out.println("Tu puntaje final es: "+puntaje);
									System.exit(0);
									break;

							default: System.out.println("Opcion no disponible");
						}
					}while(validacion!=2);

				case 2: System.out.println("Hasta luego ;)");
						System.out.println("Tu puntaje final es: "+puntaje);
						System.exit(0);
						break;

				default: System.out.println("Opcion no disponible");
			}

		}while(centinela!=2);
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

	public static int subMenuSeleccionBandera(int[] indices)
	{
		int opc = 0;

		do{
			int min = 0;
			int max = indices.length;
			opc = (int) (Math.random() * 10);
		}while(opc<1 || opc>indices.length);

		return opc-1;
	}

	public static void imprimirGraficoBandera(String[] banderas, int indice)
	{
		for (int i=indice;i<indice+20;i++ ) {
			imprimirFila(banderas[i].split(";"));
		}
			
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
}