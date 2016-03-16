package jarra;

public class jarra {//variables de instancia
	private int cantidad;
	private int capacidad;
//constructor
	public jarra(int capacidadInicial){
		if(capacidadInicial<=0){
			throw new RuntimeException("ERROR: no se pueden crear jarras con capacidad menor" +
					"o igual que cero.");
		}
		this.capacidad=capacidadInicial;
	}
//  metodos
             // 1
        public int capacidad(){
		return this.capacidad;
	}
	public int cantidad(){
		return this.cantidad;
	}
             // 2
             // 3
        public void metodoComunitario(){ 
// Comentario incluido para pruebas 
           System.out.println("Aqui escribimos todos");
         }
}
