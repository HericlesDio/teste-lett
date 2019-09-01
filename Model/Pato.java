package Model;

public class Pato extends Ave {

	public Pato() {
		super();
			}


	
	public Pato(int idade, float tamanho, String som, int ovos, String corPena, int alturaVoo) {
		super(idade, tamanho, som, ovos, corPena, alturaVoo);
	}



	@Override
	public String toString() {
		return "Pato " + super.toString() ;
	}





	
}
