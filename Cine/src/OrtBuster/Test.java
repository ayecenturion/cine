package OrtBuster;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Cine c = new Cine();
		
		System.out.println("Agrego las funciones en el cine");
		c.agregarFuncion("12/08/2021", "18:00");
		c.agregarFuncion("12/08/2021", "20:00");
		c.agregarFuncion("13/08/2021", "18:00");
		c.agregarFuncion("13/08/2021", "18:00");
		c.agregarFuncion("14/08/2021", "18:00");
		
		System.out.println("-----------------------------------------------");
		System.out.println("Listo las funciones existentes");
		c.mostrarFunciones();
		
		System.out.println("-----------------------------------------------");
		
		ArrayList<Entrada> entradasAProcesar = new ArrayList<>();
		
		entradasAProcesar.add(new Entrada("12/08/2021", "18:00", 10,'A' ));
		entradasAProcesar.add(new Entrada("12/08/2021", "18:00", 10,'B' ));
		//entradasAProcesar.add(new Entrada("12/08/2021", "18:00", 11,'A' ));
		entradasAProcesar.add(new Entrada("12/08/2021", "18:00", 9,'B' ));
		
		boolean ok = c.procesarEntradas(entradasAProcesar);
		
		System.out.println("Proceso las entradas");
		
		if(ok == true) {
			System.out.println("Las entradas se procesaron correctamente. ");
		}else {
			System.out.println("Las entradas no se pudieron procesar. ");
		}
		
	
		

	}

}
