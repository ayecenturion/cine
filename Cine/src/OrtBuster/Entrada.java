package OrtBuster;

public class Entrada {
	private String dia;
	private String hora;
	private int fila;
	private char letra;
	
	public Entrada(String dia, String hora, int fila, char letra) {
		this.setDia(dia);
		this.setHora(hora);
		this.setFila(fila);
		this.setLetra(letra);
	}

	public String getDia() {
		return dia;
	}

	private void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	private void setHora(String hora) {
		this.hora = hora;
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
	
	
}
