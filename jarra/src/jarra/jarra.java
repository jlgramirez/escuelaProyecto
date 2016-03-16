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
             // 2
        public void llena(){
		this.cantidad=this.capacidad;
	}
	public void vacia(){
		this.cantidad=0;
	}
             // 3
        public void llenaDesde(jarra j){
		while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
			this.cantidad++;
			j.cantidad--;
		} 
	
	public String toString(){
		return ("("+this.capacidad+","+this.cantidad+")");
	}

        public void metodoComunitario(){ 
// Comentario incluido para pruebas 
           System.out.println("Aqui escribimos todos");
         }
}
