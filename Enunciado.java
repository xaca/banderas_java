public class Enunciado{
	public static void main(String[] args) {
		char matriz[][];//Declaración
		matriz = new char[7][9];//Inicialización

		System.out.println("  Fun with Flags!");

		for (int i= 0; i<3 ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		matriz[i][j] = 'Y';
		 	}
		}

		for (int i= 3; i<5 ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		matriz[i][j] = 'B';
		 	}
		}

		for (int i= 5; i<7 ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		matriz[i][j] = 'R';
		 	}
		}

		for (int i= 0; i<matriz.length ;i++ ) {

		 	for (int j=0;j<matriz[0].length ;j++ ) {
		 		if(matriz[i][j]=='Y')
		 		{
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
		 		if(matriz[i][j]=='B')
		 		{
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
		 		if(matriz[i][j]=='R')
		 		{
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
		 	}
		 	System.out.println(ConsoleColors.RESET);
		}
	}
}