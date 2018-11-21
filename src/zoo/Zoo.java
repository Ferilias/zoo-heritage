package zoo;

import java.util.Arrays;

public class Zoo {
	String nom;
	Zone[] zones;
	
	public Zoo (String nom) {
		
		this.nom = nom;
	

	}
	
	public static final int INDICE_CARNIVORE = 0;
	public static final int INDICE_SAVANE_AFRICAINE = 1;
	public static final int INDICE_FERME_AUX_REPTILES = 2;
	public static final int INDICE_AQUARIUM = 3;
	public static final int INDICE_VOLIERE = 4;
	
	
	{
		this.zones = new Zone[5];
		zones[INDICE_CARNIVORE] = new Zone("Carnivore");
		zones[INDICE_SAVANE_AFRICAINE] = new Zone("Savane africaine");
		zones[INDICE_FERME_AUX_REPTILES] = new Zone("Ferme aux reptiles");
		zones[INDICE_AQUARIUM] = new Zone("Aquarium");
		zones[INDICE_VOLIERE] = new Zone("Volière");
	}

	public void addAnimal(Animal newAnimal) {
		
		if (newAnimal instanceof Mammiferes) {
			if (Animal.ALIMENT_CARNIVORE.equals(newAnimal.getRegimeAlimentaire())) {
				zones[INDICE_CARNIVORE].addAnimal(newAnimal);
			}
			else if (Animal.ALIMENT_HERBIVORE.equals(newAnimal.getRegimeAlimentaire())) {
				zones[INDICE_SAVANE_AFRICAINE].addAnimal(newAnimal);
			}
		}
		
		if ( newAnimal instanceof Reptiles) {
			zones[INDICE_FERME_AUX_REPTILES].addAnimal(newAnimal);
		}
		if ( newAnimal instanceof Poissons) {
			zones[INDICE_AQUARIUM].addAnimal(newAnimal);
		}
		if ( newAnimal instanceof Volatiles) {
			zones[INDICE_VOLIERE].addAnimal(newAnimal);
		}

	}
	

	

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Nom du zoo : " + nom + " De la zones --> " + Arrays.toString(zones)+ "\r\n";
	}

	
	

	
}

