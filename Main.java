// Concrete Class - Driver/Tester Class...
// ...because it includes the main() method
public class Main 
{
	// This is the main() method that starts our program
   public static void main(String args[])
   {
	// OBJECT/INSTANCE CREATION
	Bird birdObject1 = new Bird("Vince", false, true);
	Dog dogObject1 = new Dog("Rando", false, true);
	Fish fishObject1 = new Fish("Da Homie", false, true);
  Lizard lizardObject1 = new Lizard("Ender", false, true);

	System.out.println("\n=====================================");
	System.out.println("Print BIRD OBJECT using toString()");
	System.out.println("=====================================");

	System.out.println(birdObject1);
	birdObject1.setName("Brenda");
	birdObject1.setIsFemale(true);

	System.out.println("\n===================================");
	System.out.println("Call INSTANCE METHODS individually");
	System.out.println("====================================");
	System.out.println("FORMAT:\t\tobjectName.instanceMethodName()");
	System.out.println("BIRD NAME:\t" + birdObject1.getName());
	System.out.println("IS FEMALE:\t" + birdObject1.getIsFemale());
	System.out.println("CAN FLY:\t" + birdObject1.getCanFly());
	System.out.println("SOUND:\t" + birdObject1.sound("hello"));
	System.out.println("EAT:\t" + birdObject1.eat("seeds"));
	System.out.println("MOVE:\t" + birdObject1.move(2));
	System.out.println("SLEEP:\t" + birdObject1.sleep(2.5));
	System.out.println("KILLED:\t" + birdObject1.killPrey(3));
	
	System.out.println("\n==================================");
	System.out.println("Call STATIC METHODS individually");
	System.out.println("==================================");
	System.out.println("FORMAT:\t\tClassName.staticMethodName()");
	System.out.println("BIRD COUNT: " + Bird.getBirdObjectCount());

	System.out.println("\n===========================================");
	System.out.println("Print DOG OBJECT w/o overriding toString()");
	System.out.println("===========================================");
	System.out.println("Memory Location: " + dogObject1);
	
	System.out.println("\n============================================");
	System.out.println("Print FISH OBJECT w/o overriding toString()");
	System.out.println("============================================");
	System.out.println("Memory Location: " + fishObject1);

  System.out.println("\n============================================");
	System.out.println("Print LIZARD OBJECT w/o overriding toString()");
	System.out.println("============================================");
	System.out.println("Memory Location: " + lizardObject1);
   }
}

