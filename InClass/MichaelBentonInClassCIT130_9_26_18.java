import java.util.*;

public class MichaelBentonInClassCIT130_9_26_18
{
	public static void main(String[] a)
	{
		String name = "hi";
		char star = '*';
		int count = 0;
		System.out.println(name.charAt(1));

		name = name.toUpperCase();

		System.out.println(name);

		System.out.printf("Filling, %s", star + "\n");

		while(count<100)
		{
			System.out.println(star);
			count++;

		}

	}
}