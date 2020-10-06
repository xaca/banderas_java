public class Ejemplo{

	public static void imprimirFila(String fila[])
	{
		for (byte i=0;i<fila.length;i++) {
			
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

	public static void main(String[] args) {

		System.out.println("  Fun with Flags!");


		//System.out.println(ConsoleFile.getPath("info_banderas.txt"));

		String archivo[] = ConsoleFile.read("info_banderas.csv");
		String temp[];

		for(String i:archivo)
		{
			temp = ConsoleFile.StringToArray(i);
			imprimirFila(temp);
			
		}
	}
}