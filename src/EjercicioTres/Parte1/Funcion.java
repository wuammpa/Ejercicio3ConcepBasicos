package EjercicioTres.Parte1;

public class Funcion {
	public static void main(String[] args) {
		
		
		//return
		int Sum = suma(4,8,9);
		System.out.println(Sum);
		
	     System.out.println(" ");

		 //void
		     suma("lol","mon","lol");
		 
	}

	private static void suma(String string, String string2, String string3) {
		 String conQate = string + string2 + string3;
		 System.out.println(conQate);
		
	}

	public static int suma(int i, int j, int k) {
		return i+j+k;
		
		
	}

}
