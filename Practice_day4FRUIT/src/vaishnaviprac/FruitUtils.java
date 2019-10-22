package vaishnaviprac;

public class FruitUtils {
	
	public static int counter;
	
	public static void addFruit(Fruit f,Fruit[] basket)
	{
		if(counter > basket.length)
		basket[counter++]=f;
		
		else
			System.out.println("\n basket is full");
		
	}

}
