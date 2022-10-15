package EjercicioTres.Parte2;

public class Coche {
	int numPuertas;

	public Coche(int numPuertas) {
		this.numPuertas = numPuertas;

	}

	public void agregarPuert() {
		this.numPuertas += 1;

	}

	
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + "]";
	}
	


}
