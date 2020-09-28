public class Bandera{
	public static void main(String[] args) {
		
		char matriz[][];//Declaración
		matriz = new char[6][9];//Inicialización

		/*
		  - Imprimir la matriz agregando cero a la izquierda
		  de tal forma que la matriz al imprimirse se vea ordenadas
		  sus filas y columnas 

		  - Leer e imprimir una matriz de 100x100 posiciones

		  - Imprimir una bandera usando codigos de color y una bandera
		  de referencia.

		*/

		
		 System.out.println("Cantidad de filas "+matriz.length);
		 System.out.println("Cantidad de columnas "+matriz[0].length);

		 for (int i= 0; i<matriz.length ;i++ ) {

		 	for (int j=0;j<2 ;j++ ) {

		 		//System.out.print("("+i+","+j+")");
		 		matriz[i][j] = 'R';
		 		//System.out.print(matriz[i][j]);
		 		
		 	}
		 	//System.out.println();
		 }

		 for (int i=0;i<2 ;i++ ) {

		 	for (int j=2;j<matriz[0].length;j++ ) {
		 		matriz[i][j] = 'V';
		 	}
		 	
		 }

		 for(int i = 4; i<matriz.length; i++){

			 for(int j= 2; j<matriz[0].length; j++){
			 	matriz[i][j]= 'N';
			 }
		}

		for(int i=2; i< 4; i++)
        {
            for(int j=2;j<9;j++)
            {
                matriz[i][j]='B';
            }
        }

		 for (int i=0;i<matriz.length ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		//System.out.print(matriz[i][j]+" ");
		 		if(matriz[i][j]=='R')
		 		{
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
		 		if(matriz[i][j]=='V')
		 		{
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
		 		if(matriz[i][j]=='B')
		 		{
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
		 		if(matriz[i][j]=='N')
		 		{
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
		 		System.out.print(ConsoleColors.RESET);
		 	}
		 	System.out.println();
		 }


	}
}