package OrtBuster;

import java.util.ArrayList;

public class Cine {
	private ArrayList<Funcion> funciones;
	private ArrayList<Entrada> entradasEmitidas;
	
	public Cine () {
		this.funciones = new ArrayList<>();
		this.entradasEmitidas = new ArrayList<>();
	}
	
	public boolean procesarEntradas(ArrayList<Entrada> entradasAProcesar) {
		boolean resultado = false;
		int noProcesada = 0;
		ArrayList<Asiento> asientosOk = new ArrayList<>();
		Funcion f = null;
		Asiento a;
		
		for(Entrada e : entradasAProcesar) {
			f = existeFuncion(e.getDia(), e.getHora());
			//System.out.println(f.toString());
			if(f != null) {
				//System.out.println(e.getFila() +" "+ e.getLetra());
				a = f.existeAsiento(e.getFila(), e.getLetra());
				//System.out.println(a.toString());
				if(a != null) {
					asientosOk.add(a);
					//System.out.println(a.toString());
				}
			}
		}
		
		if(asientosOk.size() == entradasAProcesar.size()) {
			resultado = true;
			cambiarEstadoAsiento(f,asientosOk);
		}
		
		return resultado;
	}
	
	private Funcion existeFuncion(String dia, String hora) {
		int i = 0;
		Funcion fBuscada = null;
		Funcion fActual;
		
		while(i<this.funciones.size() && fBuscada == null) {
			fActual = this.funciones.get(i);
			if(fActual.getDia().equals(dia) && fActual.getHora().equals(hora)) {
				fBuscada = fActual;
			}else {
				i++;
			}
		}
		
		return fBuscada;
	}
	
	public void agregarFuncion(String dia, String hora) {
		Funcion f = existeFuncion(dia,hora);
		
		if(f == null) {
			this.funciones.add(new Funcion(dia,hora));
			System.out.println("Nueva funcion agregada ");
		}else {
			System.out.println("La funcion ya esta cargada");
		}
		
	}
	public void mostrarFunciones() {
		for(Funcion f : this.funciones) {
			System.out.println(f.toString());
			//f.mostrarAsientos();
		}
	}
	
	private void cambiarEstadoAsiento(Funcion f, ArrayList<Asiento> asientosOk) {
		f.cambiarEstado(asientosOk);
	}
	
	
}
