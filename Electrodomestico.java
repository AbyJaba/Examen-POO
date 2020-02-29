package adalidstore;

import java.util.Arrays;
import java.util.List;

/**
 * Superclase electrodomestico.
 * 
 * @author Gabriel Romero
 * @version 0.1x
 * 
 */
public class Electrodomestico {

//Atributos

	/**
	 * Atributos int preciobase. Por defecto 100.000 pesos. int peso. Por defecto
	 * 5kg String color Por defecto blanco String consumo Por defecto F Todos
	 * heredables
	 */

	protected int precioBase = 100000;

	/** El peso. */
	protected int peso = 5;

	/** El color. */
	protected colores color = colores.blanco;

	/** El consumo. */
	protected energiaConsumo consumo = energiaConsumo.F;

	/**
	 * Los Enum colores.
	 */
	public enum colores {

		/** El blanco. */
		blanco,
		/** El negro. */
		negro,
		/** El rojo. */
		rojo,
		/** El azul. */
		azul,
		/** El gris. */
		gris;
	}

	/**
	 * El Enum energiaConsumo.
	 */
	public enum energiaConsumo {

		/** El consumo A. */
		A,
		/** El consumo B. */
		B,
		/** El consumo C. */
		C,
		/** El consumo D. */
		D,
		/** El consumo E. */
		E,
		/** El consumo F. */
		F;
	}

// Getters y Setters

	/**
	 * Gets El precio base.
	 *
	 * @return preciobase
	 */

	public int getPrecioBase() {
		return precioBase;
	}

	/**
	 * Sets El precio base.
	 *
	 * @param precioBase El new preciobase
	 */
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * Gets El peso.
	 *
	 * @return El peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Sets El peso.
	 *
	 * @param peso El new peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Gets El color.
	 *
	 * @return El color
	 */
	public colores getColor() {
		return color;
	}

	/**
	 * Sets El color.
	 *
	 * @param color El new color
	 */
	public void setColor(colores color) {
		this.color = color;
	}

	/**
	 * Gets El consumo.
	 *
	 * @return El consumo
	 */
	public energiaConsumo getConsumo() {
		return consumo;
	}

	/**
	 * Sets El consumo.
	 *
	 * @param consumo El new consumo
	 */
	public void setConsumo(energiaConsumo consumo) {
		this.consumo = consumo;
	}

//Constructores

	/**
	 * Instantiates a new electrodomestico.
	 */
	public Electrodomestico() {

	}

	/**
	 * Instantiates a new electrodomestico.
	 *
	 * @param precioBase the precio base
	 * @param peso       the peso
	 */
	public Electrodomestico(int precioBase, int peso) {

		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * Instantiates a new electrodomestico.
	 *
	 * @param precioBase El precio base
	 * @param peso       El peso
	 * @param color      El color
	 * @param consumo    El consumo
	 */

	public Electrodomestico(int precioBase, int peso, String color, char consumo) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = verificaColor(color);
		this.consumo = verificaConsumo(consumo);
	}

	/**
	 * Verifica consumo.
	 *
	 * @param consumo
	 * @return El energiaconsumo
	 */
	public static energiaConsumo verificaConsumo(char consumo) {

		String ValoresdeConsumo = "ABCDEF";

		if (!(ValoresdeConsumo).contains(String.valueOf(consumo))) {

			return energiaConsumo.F;

		}
		return energiaConsumo.valueOf(Character.toString(consumo));
	}

	/**
	 * Verifica color.
	 *
	 * @param color the color
	 * @return El colores
	 */
	public static colores verificaColor(String color) {

		List<String> colors = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");

		if (!(colors.contains(color))) {

			return colores.blanco;

		}

		return colores.valueOf(color);
	}

	/**
	 * Precio Final.
	 *
	 * @param electrodomestico El electrodomestico
	 * @return El double
	 */

	public static double precioFinal(Electrodomestico electrodomestico) {

		switch (electrodomestico.getConsumo()) {
		case A:
			electrodomestico.precioBase += 100.00;
			break;
		case B:
			electrodomestico.precioBase += 85.00;
			break;
		case C:
			electrodomestico.precioBase += 60.00;
			break;
		case D:
			electrodomestico.precioBase += 50.00;
			break;
		case E:
			electrodomestico.precioBase += 30.00;
			break;
		case F:
			electrodomestico.precioBase += 10.00;
			break;
		default:
			break;
		}

		if (0 <= electrodomestico.peso && electrodomestico.peso <= 19) {
			electrodomestico.precioBase += 10.00;
		}
		if (20 <= electrodomestico.peso && electrodomestico.peso <= 49) {
			electrodomestico.precioBase += 50.00;
		}
		if (50 <= electrodomestico.peso && electrodomestico.peso <= 79) {
			electrodomestico.precioBase += 80.00;
		}
		if (electrodomestico.peso >= 80) {
			electrodomestico.precioBase += 100.00;
		}

		if (electrodomestico instanceof Lavadora)
			electrodomestico.precioBase = Lavadora.precioFinalLavadora((Lavadora) electrodomestico);
		if (electrodomestico instanceof Television)
			electrodomestico.precioBase = Television.precioFinalTelevisor((Television) electrodomestico);

		return electrodomestico.precioBase;
	}

}
