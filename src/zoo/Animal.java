package zoo;

public abstract class Animal {

	private String nomAnimal = null;
	private String typeAnimal = null;
	private String regimeAlimentaire = null;
	
	/**
	 * Les trois différents type d'habitude alimentaire.
	 */
	public static final String ALIMENT_CARNIVORE = "Carnivore";
	public static final String ALIMENT_HERBIVORE = "Herbovore";
	public static final String ALIMENT_OMNIVORE = "Omnivore";

	
	public Animal (String nomAnimal, String typeAnimal, String regimeAlimentaire) {
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
		this.regimeAlimentaire = regimeAlimentaire;
	}
	
	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public String getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	public String getRegimeAlimentaire() {
		return regimeAlimentaire;
	}

	public void setRegimeAlimentaire(String regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}

	@Override
	public String toString() {
		return "Nom de l'animal = " + nomAnimal + " C'est un : " + typeAnimal + "  il est : "
				+ regimeAlimentaire + "\r\n";
	}


	

}
