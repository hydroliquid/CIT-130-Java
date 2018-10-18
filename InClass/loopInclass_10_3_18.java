import java.util.*;

public class loopInclass_10_3_18
{
	public static void main(String[] a)
	{
		Scanner get = new Scanner(System.in);
		int i = 0;

		int students = 0;

		for(i = 1; i <= 15; i++)
		{
			System.out.print(i + " ");
			if(i%5 == 0)
			{
				System.out.println();
			}
		}

		for(int x = 0; x <= 2; x++)
		{
			System.out.print(x);
			for(int y = 3; y<= 4; y++)
			{
				System.out.print(y);
			}
			System.out.println();
		}
/*
		for(i = 5; i >= 0; i--)
		{
			System.out.println(i);
		}

		int t = 0;
		for(int myClass = 1; myClass <= 5; myClass++)
		{
			for(int ns = 1; ns <= 5; ns++)
			{
				System.out.print("Enter age: ");
				int age = get.nextInt();
				t += age;
			}
			int aveAge = t / 5;
			System.out.println("Class "+myClass +" average age is"+ aveAge);

		}
*/
		for(int x = 1; x <= 4; x++)
		{
			for(int y = 1; y <= x; y++)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}

		System.out.println(total(4,6));

		doSomething("hello",2,10);

	}// end main

	public static int total(int x, int y)
	{
		int t = 0;
		t = y + x;
		return t;
	}

	public static void doSomething(String x, int n, int m)
	{
		for(int i = n; i < m; i++)
		{
			System.out.println(i);
		}
		System.out.println("bye");
	}
}