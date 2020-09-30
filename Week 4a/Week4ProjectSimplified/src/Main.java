import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {


		ListClass listClass = new ListClass();
		HashClass hashClass = new HashClass();
		

		System.out.println("***Lunch Menu***");
		ArrayIterator arrayIterator = new ArrayIterator(listClass.lunch);
		System.out.println("***Dinner***");
		HashIterator hashIterator = new HashIterator(hashClass.dinner);

	}
}
