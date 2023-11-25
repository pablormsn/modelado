package ejercicio3P3;

import java.util.ArrayList;
import java.util.List;

public class Bandeja {
	private int capacidad;
	private List<Pieza> piezas;
	public Bandeja(int capacidad) {
		this.capacidad = capacidad;
		piezas = new ArrayList<Pieza>();
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void put(Pieza p) {
		piezas.add(p);
	}
	public Pieza get() {
		return piezas.remove(0);
	}
	public int size() {
		return (capacidad - piezas.size());
	}
}
