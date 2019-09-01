package Model;

public class Morcego extends Mamifero {

	public Morcego() {
		super();
	}



	
	public Morcego(int idade, float tamanho, String som, String corPelo, int alturaVoo) {
		super(idade, tamanho, som, corPelo, alturaVoo);
	}




	@Override
	public String toString() {
		return "Morcego " + super.toString();
	}





}
