// Concrete Child/Derived/Sub Class
//Fish class extends Animal class
public class Lizard extends Animal
{
  private boolean canTeleport;
  public Lizard()
	{
		// super() calls Animal class' No-Arg Constructor
		super();
	}

  	public Lizard(String name, boolean isFemale, boolean canTeleport)
	{
		// super(name, isFemale) calls the...
		// ...Animal class' Parameterized Constructor
		super(name, isFemale);
    this.canTeleport = canTeleport;

	}
	// method overide - originally declared in abstract Animal class
  public String sound(String word)
  {
    return "This Lizard says... " + word;
  }

	// method overide - orginally declared in Behavior interface
	public String move(int minutes)
	{
		return "This Lizard sprints " + minutes + " miles";
	}

	// method overide - orginally declared in Behavior interface
	public String sleep(double hours)
	{
		return "This Lizard sleeps " + hours + "hours with eyes open, EPICO!";
	}

	// method overide - originally declared in Hunt interface
	public String killPrey(int numPrey)
	{
		return "This Lizard killed " + numPrey + " Steve' s.";

	}

  // Getter or Accessor - Instance Method with Implementation
	public boolean getCanTeleport()
	{
		return canTeleport;
	}

	// Setter or Mutator - Instance Method with Implementation
	public void setTeleport(boolean canTeleport)
	{
		this.canTeleport = canTeleport;
	}
  
  public String eat(String food)
	{
		return "This LIZARD eats " + food + " DAILY.";
	}
  public String toString()
	{
		return"THIS LIZARD'S NAME IS: " + getName() + 
				"\nTHIS LIZARD IS FEMALE: " + getIsFemale() + 
        "\nTHIS LIZARD TELEPORTS: " + canTeleport + " WOW" + 
				"\nSOUND:\t" + sound("HISS HISS") +
				"\nEAT:\t" + eat("SUPER FRIES") +
				"\nMOVE:\t" + move(200) +
				"\nSLEEP:\t" + sleep(1) +
				"\nKILLED:\t" + killPrey(37);
	}
}