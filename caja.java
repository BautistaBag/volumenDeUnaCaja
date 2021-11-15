
public class caja {

		private int ancho;
		private int alto;
		private int profundo;
		public caja(int ancho,int alto,int profundo) {
		this.ancho=ancho;
		this.alto=alto;
		this.profundo=profundo;
		}
		
		public int calcularVolumen() {
			int volumen=0;
			volumen = this.ancho*this.alto*this.profundo;
			return volumen;
		}
		
		
}
