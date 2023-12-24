import org.testng.annotations.Test;

public class Cat extends Animal {
	@Test
	public void makeNoise() {
	
		System.out.println("cat noises meao meao");
	
		walk();
	}
}
