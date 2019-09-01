package Controller;

import java.util.ArrayList;

import Model.Animal;
import Model.Mamifero;
import Model.Ave;
import Model.Galinha;
import Model.Morcego;
import Model.Pato;
import Model.Vaca;


public class Fazenda {

	private ArrayList<Animal> animais = new ArrayList<>();

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public void inserirAnimal(Animal animais) throws Exception {
		boolean adicionar = false;
		if (animais instanceof Galinha) {
			adicionar = getAnimais().add((Galinha) animais);
		} else if (animais instanceof Pato) {
			adicionar = getAnimais().add((Pato) animais);
		} else if (animais instanceof Vaca) {
			adicionar = getAnimais().add((Vaca) animais);
		} else if (animais instanceof Morcego) {
			adicionar = getAnimais().add((Morcego) animais);
		}
		if (!adicionar) {
			throw new Exception("Erro ao inserir animal");
		}
	}
	
	public void imprimirGalinhas() throws Exception {
		ArrayList<Galinha> listagalinha = (ArrayList<Galinha>) getAnimais().clone();
		
		for (Animal i : listagalinha) {
			if(i instanceof Galinha) {
				System.out.println(i.toString());	
			}
			
			
		}

	}
	public void imprimirPatos() throws Exception {
		ArrayList<Pato> listapato = (ArrayList<Pato>) getAnimais().clone();
		
		for (Animal i : listapato) {
			if(i instanceof Pato) {
			System.out.println(i.toString());
		}}

	}
	public void imprimirVacas() throws Exception {
		ArrayList<Vaca> listavaca= (ArrayList<Vaca>) getAnimais().clone();
		
		for (Animal i : listavaca) {
			if(i instanceof Vaca) {
			System.out.println(i.toString());
		}}

	}
	public void imprimirMorcego() throws Exception {
		ArrayList<Morcego> listamorcego = (ArrayList<Morcego>) getAnimais().clone();
		
		for (Animal i : listamorcego) {
			if(i instanceof Morcego) {
			System.out.println(i.toString());
		}}

	}
}
