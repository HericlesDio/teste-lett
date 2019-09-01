package Model;

public class Galinha extends Ave {

	public Galinha() {
		super();
	}





	public Galinha(int idade, float tamanho, String som, int ovos, String corPena, int alturaVoo) {
		super(idade, tamanho, som, ovos, corPena, alturaVoo);
		}





	@Override
	public String toString() {
		return "Galinha " + super.toString();
	}
	

	
	
}
