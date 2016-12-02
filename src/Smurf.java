/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */


public class Smurf {


	private String name;


	Smurf(String name) {
		this.name = name;
	}


	public String getName() {
		return "My name is " + name + " Smurf.";
	}


	public void eat() {
		System.out.println(name + " Smurf is eating his fellow Smurfs.  Then he joins ISIS and assasinates Donald Trump.\n  But Kin Jon Un steps out of the shadows and says, 'Handy, I am your fathwe.'\n  Together, they bring Hitler back from the dead and they ruin the world.  THE END!");
	}


	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		return "";
	}


	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		return "";
	}


}
