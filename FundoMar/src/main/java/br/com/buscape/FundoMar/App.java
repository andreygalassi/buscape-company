package br.com.buscape.FundoMar;

public class App {
    
	public static void main( String[] args ) {

		String comandos = args[0];
		
		if (comandos!=null){
			Submarino submarino = new Submarino();
			
			System.out.println(submarino.comando(comandos));
			
		}else{
			System.out.println("Entre com os comandos do submarinos.");
		}
		
    }
}
