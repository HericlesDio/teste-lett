package Model;

public class Vaca extends Mamifero {

	public Vaca() {
		super();
	}


	public Vaca(int idade, float tamanho, String som, String corPelo, int alturaVoo) {
		super(idade, tamanho, som, corPelo, alturaVoo);
	}


	@Override
	public String toString() {
		return  "Vaca " + super.toString() ;
	}




}
