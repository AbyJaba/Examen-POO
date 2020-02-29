package adalidstore;

/**
 * La Clase Television.
 */
public class Television extends Electrodomestico {

	/**
	 * Atributos
	 *
	 * La resolucion.
	 *
	 */
	int resolucion = 20;

	/** El sintonizador TDT. */
	boolean sintonizadorTDT = false;

	/**
	 * Constructores
	 *
	 * Instantiates a new television.
	 */
	public Television() {
		super();
	}

	/**
	 * Instanciacion de una television.
	 *
	 * @param precioBase the precio base
	 * @param peso       the peso
	 */
	public Television(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * Instanciacion de una television.
	 *
	 * @param precioBase      the precio base
	 * @param color           the color
	 * @param consumo         the consumo
	 * @param peso            the peso
	 * @param resolucion      the resolucion
	 * @param sintonizadorTDT the sintonizador TDT
	 */
	public Television(int precioBase, int peso, String color, char consumo, int resolucion, boolean sintonizadorTDT) {
		super();
		this.precioBase = precioBase;
		this.color = verificaColor(color);
		this.consumo = verificaConsumo(consumo);
		this.peso = peso;
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Gets de resolución.
	 *
	 * @return resolution
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * Verifica si tiene sintonizador TDT.
	 *
	 * @return true, if is TD treceiver
	 */
	public boolean isTDTreceiver() {
		return sintonizadorTDT;
	}

	/**
	 * Precio final televisor.
	 *
	 * @param electrodomestico the electrodomestico
	 * @return the double
	 */
	public static int precioFinalTelevisor(Television electrodomestico) {
		if (electrodomestico.sintonizadorTDT)
			electrodomestico.precioBase += 50.00;

		if (electrodomestico.resolucion > 40)
			electrodomestico.precioBase *= 1.30;

		return electrodomestico.precioBase;
	}

}
