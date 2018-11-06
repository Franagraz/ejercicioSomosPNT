package ejercicio;

public class Higiene extends Producto {

	private int contenido;

	public Higiene(String nombre, int precio, int contenido) {
		super(nombre, precio);
		this.setContenido(contenido);
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + super.getNombre() + " /// Contenido: " + contenido + "ml /// Precio: $" + super.getPrecio();
	}

}
