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

	//get and set

	public int getId()
	{
		returnId
	}
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getYearDiscovered()
	{
		return yearDiscovered;
	}

	public void setYearDiscovered(int yearDiscovered)
	{
		this.yearDiscovered = yearDiscovered;
	}

	public int getFood()
	{
		return food;
	}

	public void setFood(int food)
	{
		this.food = food;
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