package Aereo;

public class vehiculoAereo {
	private float peso;
	private float tamano;
	private String color;
	private String nombre;
	private String modelo;
	int nrotripulantes;
	
	public vehiculoAereo(float peso, float tamano, String color, String nombre, String modelo, int nrotripulantes) {
		
		this.peso = peso;
		this.tamano = tamano;
		this.color = color;
		this.nombre = nombre;
		this.modelo = modelo;
		this.nrotripulantes = nrotripulantes;
	}

	public int getNrotripulantes() {
		return nrotripulantes;
	}

	public void setNrotripulantes(int nrotripulantes) {
		this.nrotripulantes = nrotripulantes;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getTamano() {
		return tamano;
	}

	public void setTamano(float tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String toString() {
		return "\nSe llama " + this.getNombre() + "\nPesa: "+ this.getPeso()+"Kg" + "\nMide: "+ this.getTamano() + "Mts" + "\nEs de color: " + this.getColor()
		+"\nDe modelo " + this.getModelo() + "\nTiene: "+ this.getNrotripulantes()+" Tripulantes\n";
	}

	
}
