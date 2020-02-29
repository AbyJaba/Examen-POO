package adalidstore;

/**
 * The Class Lavadora.
 */
public class Lavadora extends Electrodomestico {

// Atributos

	/** The carga. */
	int carga = 5;

//Constructores

	// Constructor por defecto

	/**
	 * Instantiates a new lavadora.
	 */
	public Lavadora() {
		super();
	}

	/**
	 * Instantiates a new lavadora.
	 *
	 * @param precioBase the precio base
	 * @param peso       the peso
	 */
	public Lavadora(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * Instantiates a new lavadora.
	 *
	 * @param precioBase the precio base
	 * @param peso       the peso
	 * @param color      the color
	 * @param consumo    the consumo
	 * @param carga      the carga
	 */
	public Lavadora(int precioBase, int peso, String color, char consumo, int carga) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.carga = carga;
		this.color = verificaColor(color);
		this.consumo = verificaConsumo(consumo);

	}

	/**
	 * Instantiates a new lavadora.
	 *
	 * @param cARGA the c ARGA
	 */
	public Lavadora(int cARGA) {
		super();
		carga = cARGA;
	}

// Métodos

	/**
	 * Gets the carga.
	 *
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Precio final lavadora.
	 *
	 * @param electrodomestico the electrodomestico
	 * @return the double
	 */
	public static int precioFinalLavadora(Lavadora electrodomestico) {
		if (electrodomestico.carga > 30) {
			electrodomestico.precioBase += 50.00;
		}
		return electrodomestico.precioBase;
	}

}
