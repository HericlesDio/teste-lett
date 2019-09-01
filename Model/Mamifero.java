package Model;

public class Mamifero extends Animal {

	private String corPelo;
	private int alturaVoo;
	
	public Mamifero() {}

	
	public Mamifero(int idade, float tamanho, String som, String corPelo, int alturaVoo) {
		super(idade, tamanho, som);
		this.corPelo = corPelo;
		this.alturaVoo = alturaVoo;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	public int getAlturaVoo() {
		return alturaVoo;
	}

	public void setAlturaVoo(int alturaVoo) {
		this.alturaVoo = alturaVoo;
	}


	@Override
	public String toString() {
		return super.toString() + "É um Mamifero com o pelo de cor " + corPelo + ", e voa " + alturaVoo + " metros";
	}
	
	
	
	
}
