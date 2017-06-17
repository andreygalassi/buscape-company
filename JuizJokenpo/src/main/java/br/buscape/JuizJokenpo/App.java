package br.buscape.JuizJokenpo;

public class App {
    
	public static void main( String... args ){
    
		if (args.length!=2){
			System.out.println("Informe as 2 armas. Elas podem ser PEDRA, PAPEL, TESOURA");
			return ;
		}

		try {
			Arma arma1 = Arma.getArma(args[0]);
			Arma arma2 = Arma.getArma(args[1]);
			
			Juiz juiz = new Juiz();
			
			System.out.println(juiz.joKenPo(arma1, arma2));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
    }
}
