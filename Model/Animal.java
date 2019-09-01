package Model;

public class Animal {

	private int idade;
	private float tamanho;
	public String som;
	
	public Animal() {}

	public Animal(int idade, float tamanho, String som) {
		super();
		this.idade = idade;
		this.tamanho = tamanho;
		this.som = som;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	@Override
	public String toString() {
		return "a idade dele é " + idade + ", e seu tamanho é " + tamanho + ", Esse animal " + som + " ";
	}
	
	
	
	
}
