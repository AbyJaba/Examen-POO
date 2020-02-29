package adalidstore;

/**
 * La Clase AdminProductos.
 */
public class AdminProductos {

	/**
	 * Arreglo productos.
	 *
	 * @return Electrodomestico[]
	 */
	public static Electrodomestico[] arregloProductos() {
		Electrodomestico[] productos = new Electrodomestico[10];

		return productos;
	}

	/**
	 * Sumar productos.
	 *
	 * @param productos the productos
	 * @return electrodomestico[]
	 * 
	 *         Arreglo con los productos a utilizar en el programa
	 */
	public static Electrodomestico[] sumarProductos(Electrodomestico[] productos) {

		productos[0] = new Electrodomestico(100, 25, "rojo", 'F');
		productos[1] = new Lavadora(300, 45, "blanco", 'E', 35);
		productos[2] = new Lavadora(600, 40, "blanco", 'F', 30);
		productos[3] = new Electrodomestico(150, 15, "gris", 'B');
		productos[4] = new Electrodomestico(220, 10, "negro", 'A');
		productos[5] = new Electrodomestico(60, 5, "blanco", 'F');
		productos[6] = new Electrodomestico(20, 5, "rojo", 'C');
		productos[7] = new Electrodomestico(80, 30, "rojo", 'B');
		productos[8] = new Television(150, 5, "negro", 'F', 1080, false);
		productos[9] = new Television(1000, 7, "azul", 'A', 3840, true);

		return productos;
	}

	/**
	 * Precio electrodomestico.
	 *
	 * @param productos
	 * @return the int[]
	 */
	public static int[] precioElectrodomestico(Electrodomestico[] productos) {

		int precioElectrodomestico = 0;
		int precioTelevisor = 0;
		int precioLavadora = 0;
		int[] precios = new int[3];

		for (int i = 0; i < 10; i++) {

			if (productos[i] instanceof Television) {
				precioTelevisor += Electrodomestico.precioFinal(productos[i]);
			}

			if (productos[i] instanceof Lavadora) {
				precioLavadora += Electrodomestico.precioFinal(productos[i]);
			}

			if (!(productos[i] instanceof Television) && !(productos[i] instanceof Lavadora)) {
				precioElectrodomestico += Electrodomestico.precioFinal(productos[i]);
			}
		}

		precios[0] = precioElectrodomestico;
		precios[1] = precioLavadora;
		precios[2] = precioTelevisor;

		return precios;
	}

}
