package OrtBuster;

import java.util.ArrayList;

public class Funcion {
	private static int FILAS = 10;
	private static int COLUMNAS = 2;
	private String dia;
	private String hora;
	private Asiento[][] asientos = new Asiento[FILAS][COLUMNAS];
	
	public Funcion(String dia, String hora) {
		this.setDia(dia);
		this.setHora(hora);
		crearAsientos();
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
	
	public Asiento existeAsiento(int fila, char letra) {
		//System.out.println(fila + " " + letra);
		Asiento aBuscado = null;
		boolean existe = false;
		int i = 0;
		Asiento a;
		
		while(i < this.asientos.length -1 && !existe ) {
			 int j = 0;
			 while(j <this.asientos[i].length && !existe ) {
				 //System.out.println(this.asientos[i][j].toString());
				 if(this.asientos[i][j].getLetra() == letra && this.asientos[i][j].getFila() == fila) {
					 //System.out.println(this.asientos[i][j].toString());
					 aBuscado = this.asientos[i][j];
					 System.out.println(aBuscado.toString());
					 existe = true;
		 		}else {
		 			j++;
		 		}
			 
		     }
			 i++;
		}
		//System.out.println(aBuscado.toString());
		return aBuscado;
	}
	
	private void crearAsientos() {
		char letra = 'A';
		for(int i = 0; i<this.asientos.length; i++) {
			for(int j = 0; j<this.asientos[i].length; j++) {
				Asiento a = new Asiento(i+1,letra);
				this.asientos[i][j] = a;
				letra++;
			}
			letra = 'A';
		}
	}


	@Override
	public String toString() {
		return "Funcion [dia=" + dia + ", hora=" + hora + "]";
	}
	
	public void cambiarEstado(ArrayList<Asiento> asientosOk) {
		
	}
	
	public void mostrarAsientos() {
		for (int i=0; i < this.asientos.length; i++) {
			 for (int j=0; j < this.asientos[i].length; j++) {
				 System.out.println(this.asientos[i][j]);
			 }
		}
	}
}
