package ejercicio;

public class Bebida extends Producto {
	private double litros;

	public Bebida(String nombre, int precio, double litros) {
		super(nombre, precio);
		this.setLitros(litros);
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public String toString() {
		return "Nombre: " + super.getNombre() + " /// Litros: " + litros + " /// Precio: $" + super.getPrecio();
	}

}
