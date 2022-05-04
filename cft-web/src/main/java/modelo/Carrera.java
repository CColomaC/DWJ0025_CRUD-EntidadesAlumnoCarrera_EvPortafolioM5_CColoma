package modelo;

public class Carrera {
	// ATRIBUTOS O PROPIEDADES O VARIABLES DE INSTANCIA 
	private int id;
	private String nombre;
	
	// CONSTRUCTORES 	
	public Carrera() {
	}
	
	public Carrera(String nombre) {
		this.nombre = nombre;
	}

	public Carrera(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	// GETTERS Y SETTERS 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}		
}
