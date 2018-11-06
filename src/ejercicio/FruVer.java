package ejercicio;

public class FruVer extends Producto {
	private String unidadDeVenta;

	public FruVer(String nombre, int precio, String unidadDeVenta) {
		super(nombre, precio);
		this.setUnidadDeVenta(unidadDeVenta);
	}

	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}

	public String toString() {
		return "Nombre: " + super.getNombre() + " /// Precio: " + super.getPrecio() + "$ /// Unidad de venta: "
				+ unidadDeVenta;
	}

}
