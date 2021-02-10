package animal;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
	
	public static void main(String[] args)
	{
		System.out.println("This is a test...Yes... This is a test");
		
// Mammals
		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals racoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

// Birds
		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("swan", 1758);

// Fish
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);
// List
		List<AbstractAnimal> myList = new ArrayList<>();
		
		// myList.add(panda);
		// myList.add(zebra);
		// myList.add(koala);
		// myList.add(sloth);
		// myList.add(armadillo);
		// myList.add(racoon);
		// myList.add(bigfoot);
		// myList.add(pigeon);
		// myList.add(peacock);
		// myList.add(toucan);
		// myList.add(parrot);
		// myList.add(swan);
		// myList.add(salmon);
		// myList.add(catfish);
		// myList.add(perch);
		
		// (Refactored Below)

		myList.addAll(Arrays.asList(panda, zebra, koala, sloth, armadillo, racoon, bigfoot, pigeon, peacock, toucan, parrot, swan, salmon, catfish, perch));

		myList.forEach((v) -> System.out.println(v))
		// System.out.println(myList.toString());

//Lambda Expressions
		// All animals in descending order by year
		System.out.println("\n Year in Descending Order: ");
		animals.sort((v1, v2) -> v2.)
	}

}
