package Model;

public class Ave extends Animal {
	
	private int ovos;
	private String corPena;
	private int alturaVoo;
	
	
	
	
	public Ave(int idade, float tamanho, String som, int ovos, String corPena, int alturaVoo) {
		super(idade, tamanho, som);
		this.ovos = ovos;
		this.corPena = corPena;
		this.alturaVoo = alturaVoo;
	}
	
	public Ave(){}


	public int getOvos() {
		return ovos;
	}


	public void setOvos(int ovos) {
		this.ovos = ovos;
	}


	public String getCorPena() {
		return corPena;
	}


	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}


	public int getAlturaVoo() {
		return alturaVoo;
	}


	public void setAlturaVoo(int alturaVoo) {
		this.alturaVoo = alturaVoo;
	}

	@Override
	public String toString() {
		return super.toString() + "É uma Ave ele bota "+ ovos +" ovos, Suas Penas tem a cor " + corPena + ", ele voa " + alturaVoo + " metros";
	}
	
	
	
}
