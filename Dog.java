// Concrete Child/Derived/Sub Class
//Dog class extends Animal class
public class Dog extends Animal
{
  private boolean doesBite;
	// No-Argument Constructor
	public Dog()
	{
		// super() calls Animal class' No-Arg Constructor
		super();  
    this.doesBite = true;
	}

	// parameterized constructor
	public Dog(String name, boolean isFemale, boolean doesBite)
	{
		// super(name, isFemale) calls the...
		// ...Animal class' Parameterized Constructor
		super(name, isFemale);
    this.doesBite = true;
	}

	// method overide - originally declared in abstract Animal class
	public String sound(String word)
	{
		return "This dog says..." + word;
	}

	// method overide - orginally declared in Behavior interface
	public String move(int minutes)
	{
		return "This dog runs " + minutes + " min(s)";
	}

	// method overide - orginally declared in Behavior interface
	public String sleep(double hours)
	{
		return "This dog sleeps " + hours + "hours on their back";
	}

	// method overide defined in HUNT interface
	public String killPrey(int numPrey)
	{
		return "This dog killed " + numPrey + " squirrel(s).";
	}

  public String eat(String food)
	{
		return "This DOG eats " + food + " normally.";
	}
  // Getter or Accessor - Instance Method with Implementation
	public boolean getDoesBite()
	{
		return doesBite;
	}

	// Setter or Mutator - Instance Method with Implementation
	public void setBite(boolean doesBite)
	{
		this.doesBite = doesBite;
	}

	// Method Overide - originally declared in Object class
	// Object class is the parent class of all classes in Java
	// If not overriden, Java will output the memory address
	public String toString()
	{
		return	"THIS DOG'S NAME IS: " + getName() + 
				"\nTHIS DOG IS FEMALE: " + getIsFemale() + 
        "\nTHIS DOG BITES: " + doesBite +
				"\nSOUND:\t" + sound("SQUIRREL") +
				"\nEAT:\t" + eat("BEEF") +
				"\nMOVE:\t" + move(330) +
				"\nSLEEP:\t" + sleep(2) +
				"\nKILLED:\t" + killPrey(9);
	}
}