package Aereo;

public class avionmilitar extends vehiculoAereo {
	String tipo;
	int maxcarg;

	public avionmilitar(float peso, float tamano, String color, String nombre, String modelo, int nrotripulantes,
			String tipo, int maxcarg) {
		super(peso, tamano, color, nombre, modelo, nrotripulantes);
		this.tipo = tipo;
		this.maxcarg = maxcarg;
	}

	public int getMaxcarg() {
		return maxcarg;
	}

	public void setMaxcarg(int maxcarg) {
		this.maxcarg = maxcarg;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	 @Override
	public String toString() {
		return "\nAvion militar" + "\nEs un avion de tipo: " + this.getTipo() + super.toString();
		}
	

}
