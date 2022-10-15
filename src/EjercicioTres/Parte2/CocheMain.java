package EjercicioTres.Parte2;

public class CocheMain {

	public static void main(String[] args) {

		Coche miCoche = new Coche(1);

		miCoche.agregarPuert();

		System.out.println(miCoche.numPuertas);

		System.out.println(miCoche);
	}
}
