package zoo;


import zoo.Mammiferes;
import zoo.Poissons;
import zoo.Reptiles;
import zoo.Volatiles;
import zoo.Zoo;



public class TestZoo {

	public static void main(String[] args) {
				
	Zoo zoo = new Zoo("monZooo");
	
	
	zoo.addAnimal(new Mammiferes("Feri1", "lion", Mammiferes.ALIMENT_CARNIVORE));
	zoo.addAnimal(new Mammiferes("feri2", "lion", Mammiferes.ALIMENT_CARNIVORE));
	zoo.addAnimal(new Mammiferes("feri3", "gazelle", Mammiferes.ALIMENT_HERBIVORE));
	zoo.addAnimal(new Mammiferes("feri4", "antilope", Mammiferes.ALIMENT_HERBIVORE));
	zoo.addAnimal(new Mammiferes("feri5", "zèbre", Mammiferes.ALIMENT_HERBIVORE));
	zoo.addAnimal(new Poissons("feri6", "requin", Poissons.ALIMENT_CARNIVORE));
	zoo.addAnimal(new Poissons("feri7", "morue", Poissons.ALIMENT_CARNIVORE));
	zoo.addAnimal(new Reptiles("feri8", "anaconda", Reptiles.ALIMENT_CARNIVORE));
	zoo.addAnimal(new Reptiles("feri9", "boa", Reptiles.ALIMENT_CARNIVORE));

	System.out.println(zoo.toString());
	
	
	
	}

}
