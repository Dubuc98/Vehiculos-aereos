package Aereo;

public class avionpasajeros extends vehiculoAereo {
	int cargamax;
	int pasajeros;
	
	public avionpasajeros(float peso, float tamano, String color, String nombre, String modelo, int nrotripulantes,
			int cargamax, int pasajeros) {
		super(peso, tamano, color, nombre, modelo, nrotripulantes);
		this.cargamax = cargamax;
		this.pasajeros = pasajeros;
	}

	public int getCargamax() {
		return cargamax;
	}

	public void setCargamax(int cargamax) {
		this.cargamax = cargamax;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	 @Override
	public String toString() {
		return "\nAvion de pasajeros" + "\nTiene una carga maxima de: " + this.getCargamax() + "\nTiene un numero max de pasajeros de:"
				 + this.getPasajeros() + super.toString();
		}
}
