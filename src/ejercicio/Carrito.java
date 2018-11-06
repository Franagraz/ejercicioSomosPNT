package ejercicio;

import java.util.ArrayList;

public class Carrito {
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	public ArrayList<Producto> getProducto() {
		return productos;
	}

	public void procesarProductos() {
		Producto prodMasBarato = productos.get(0);
		Producto prodMasCaro = productos.get(0);
		for (Producto p : productos) {

			System.out.println(p.toString());

			if (p.compareTo(prodMasBarato) == -1) {
				prodMasBarato = p;
			} else if (p.compareTo(prodMasCaro) == 1) {
				prodMasCaro = p;
			}

		}
		System.out.println("=============================");
		System.out.println("Producto más caro: " + prodMasCaro.getNombre());
		System.out.println("Producto más barato: " + prodMasBarato.getNombre());
	}

}
