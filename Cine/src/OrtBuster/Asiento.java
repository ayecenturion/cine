package OrtBuster;

public class Asiento {
	private int fila;
	private char letra;
	private EstadoAsiento estado;
	
	public Asiento(int fila, char letra) {
		this.setFila(fila);
		this.setLetra(letra);
		this.setEstado(EstadoAsiento.LIBRE);
	}
	
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		this.fila = fila;
	}
	public char getLetra() {
		return letra;
	}
	private void setLetra(char letra) {
		this.letra = letra;
	}
	public EstadoAsiento getEstado() {
		return estado;
	}
	private void setEstado(EstadoAsiento estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", letra=" + letra + "]";
	}
	
	
}
