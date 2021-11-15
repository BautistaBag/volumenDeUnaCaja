
public class main {

	public static void main(String[] args) {
		
		//Creamos una primera caja e ingresamos su ancho,alto y profundidad
		caja caja1 = new caja(5,5,5);
		//Creamos una segunda caja
		caja caja2  = new caja(4,2,7);
		
		//Llamamos a la funcion calcularVolumen, para calcular el volumen de ambas cajas y mostrarlas por pantalla
		System.out.println(caja1.calcularVolumen());
		System.out.println(caja2.calcularVolumen());
	}
}
