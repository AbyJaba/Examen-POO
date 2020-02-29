package adalidstore;

/**
 * The Class AppProductos.
 */
public class AppProductos {

	/**
	 * El Método Main
	 *
	 * @param args the arguments
	 */

	public static void main(String[] args) {

		Electrodomestico[] productos = AdminProductos.arregloProductos();

		productos = AdminProductos.sumarProductos(productos);

		int precioFinal[] = AdminProductos.precioElectrodomestico(productos);

		System.out.println("\n");

		System.out.println("RESUMEN DE PRODUCTOS: \n");

		System.out.println("Total en Electrodomésticos: \t" + String.format("%10d", precioFinal[0]) + " \u20AC"
				+ String.format("%10d", ((precioFinal[0])) * 900) + " CLP, ");

		System.out.println("Total en Lavadoras: \t\t" + String.format("%10d", precioFinal[1]) + " \u20AC"
				+ String.format("%10d", ((precioFinal[1])) * 900) + " CLP, ");

		System.out.println("Total en Televisores: \t\t" + String.format("%10d", precioFinal[2]) + " \u20AC"
				+ String.format("%10d", ((precioFinal[2])) * 900) + " CLP, ");

		System.out.print("\n");

		System.out.println("Total General: \t\t\t"
				+ String.format("%10d", (precioFinal[0] + precioFinal[1] + precioFinal[2])) + " \u20AC"
				+ String.format("%10d", ((precioFinal[0] + precioFinal[1] + precioFinal[2])) * 900) + " CLP, ");

		System.out.println("\n");
		System.out.println("Valor aproximado del cambio Euro/Peso = 900,00");

	}

}
