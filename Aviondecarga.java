package Aereo;

public class Aviondecarga extends vehiculoAereo {
	int cargamax;
	
	
	public Aviondecarga(float peso, float tamano, String color, String nombre, String modelo, int cargamax,
			int nrotripulantes) {
		super(peso, tamano, color, nombre, modelo, nrotripulantes);
		this.cargamax = cargamax;
	}
	@Override
	public String toString() {
		return "\nAvion de carga" + "\nTiene una carga maxima de: " + this.getCargamax() + super.toString();
		}
	public int getCargamax() {
		return cargamax;
	}
	public void setCargamax(int cargamax) {
		this.cargamax = cargamax;
	};
}
