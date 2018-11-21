package zoo;

import java.util.Arrays;

public class Zone {
	String nom;
	Animal [] animaux =null;
	
	public Zone(String nom) {
		
		this.nom = nom;
		
	}
	
	public void addAnimal (Animal newAnimal) {
			if (animaux == null) {
				this.animaux = new Animal [1];
				this.animaux[0] = newAnimal;
			}
			else {
			Animal[] animauxtempo = new Animal[this.animaux.length+1];
			for (int i = 0; i < this.animaux.length;i++) {
				animauxtempo[i] = this.animaux[i];
			}
			animauxtempo[animaux.length] = newAnimal;
			this.animaux = animauxtempo;
		}
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Nom de la zone des : " + nom + " Contient les animaux suivant : \r\n" + Arrays.toString(animaux)+"\r\n";
	}

	
	
	
}
