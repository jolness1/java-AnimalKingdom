package animal;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
	public static List<AbstractAnimal> filterAnimals(List<AbstractAnimal> list, CheckAnimal tester)
	{
		List<AbstractAnimal> tempList = new ArrayList<>();
		for (AbstractAnimal v : list)
		{
			if (tester.test(v))
			{
				tempList.add(v);
			}
		}

		return tempList;
	}

	public static List<AbstractAnimal> sortObjects(List<AbstractAnimal> list,CheckAnimal tester)
	{
		List<AbstractAnimal> tempList = new ArrayList<>();
		for (AbstractAnimal v : list)
		{
			if (tester.test(v))
			{
				tempList.add(v);
			}
		}
		tempList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		return tempList;
	}
	
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
		Birds swan = new Birds("Swan", 1758);

// Fish
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);
// List
		List<AbstractAnimal> myList = new ArrayList<>();

		myList.addAll(Arrays.asList(panda, zebra, koala, sloth, armadillo, racoon, bigfoot, pigeon, peacock, toucan, parrot, swan, salmon, catfish, perch));

		myList.forEach((v) -> System.out.println(v));
		System.out.println(myList.toString());

//Lambda Expressions
		
		// All animals in descending order by year
		System.out.println("\n Animals sorted by year in Descending Order: ");
		myList.sort((v1, v2) -> v2.getYearDiscovered() - v1.getYearDiscovered());
		myList.forEach((v) -> System.out.println(v.getName()));
		
		// Alphabetical Order
		System.out.println("\n Sorted Alphabetically");
		myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		myList.forEach((v) -> System.out.println(v.getName()));

		// Sort By Movement Method
		System.out.println("\n Sort by movement method");
		myList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
		myList.forEach((v) -> System.out.println(v.getName()));
	
		// filtered for if they have lungs
		System.out.println("\n Has Lungs");
		List<AbstractAnimal> filteredAnimals = filterAnimals(myList,(animal) -> animal.breathe() == "Lungs");

		System.out.println(filteredAnimals);


		// filtered discovery after 1758 + has lungs
		System.out.println("\n Has Lungs & Discovered after 1758");
		filteredAnimals = filterAnimals(myList,(animal) -> animal.breathe() == "Lungs" && animal.getYearDiscovered() == 1758);

		System.out.println(filteredAnimals);

		
	}

}
















