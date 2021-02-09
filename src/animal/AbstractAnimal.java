package animal;

abstract class AbstractAnimal
{
	//Fields
	private static int maxId = 0;
	protected int id;
	protected String name;
	protected int yearDiscovered;
	protected int food;

	//Constructors

	public AbstractAnimal(String name, int yearDiscovered)
	{
		id = maxId++;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
		food = 0;
	}

	//Abstract Methods

	abstract String move();
	abstract String breathe();
	abstract String reproduce();

	//Full Methods

	void eat()
	{
		food++;
	}
}