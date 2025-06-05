// Concrete Child/Derived/Sub Class
//Fish class extends Animal class
public class Fish extends Animal
{
  private boolean doesBreathe;
  public Fish()
	{
		// super() calls Animal class' No-Arg Constructor
		super();
	}

  	public Fish(String name, boolean isFemale, boolean doesBreathe)
	{
		// super(name, isFemale) calls the...
		// ...Animal class' Parameterized Constructor
		super(name, isFemale);
    this.doesBreathe = doesBreathe;

	}
	// method overide - originally declared in abstract Animal class
	public String sound(String word)
	{
		return "This fish says... " + word;
	}

	// method overide - orginally declared in Behavior interface
	public String move(int minutes)
	{
		return "This fish swims " + minutes + " min(s)";
	}

	// method overide - orginally declared in Behavior interface
	public String sleep(double hours)
	{
		return "This fish sleeps " + hours + "hours with eyes open";
	}

	// method overide - originally declared in Hunt interface
	public String killPrey(int numPrey)
	{
		return "This fish killed " + numPrey + " (s).";

	}

  // Getter or Accessor - Instance Method with Implementation
	public boolean getDoesBreathe()
	{
		return doesBreathe;
	}

	// Setter or Mutator - Instance Method with Implementation
	public void setBreathe(boolean doesBreathe)
	{
		this.doesBreathe = doesBreathe;
	}
  
  public String eat(String food)
	{
		return "This FISH eats " + food + " normally.";
	}
  public String toString()
	{
		return"THIS FISH'S NAME IS: " + getName() + 
				"\nTHIS FISH IS FEMALE: " + getIsFemale() + 
        "\nTHIS FISH BREATHES: " + doesBreathe + " WOW EPIC" + 
				"\nSOUND:\t" + sound("Blub Blub") +
				"\nEAT:\t" + eat("Plankton") +
				"\nMOVE:\t" + move(3) +
				"\nSLEEP:\t" + sleep(7.4) +
				"\nKILLED:\t" + killPrey(11);
	}
}