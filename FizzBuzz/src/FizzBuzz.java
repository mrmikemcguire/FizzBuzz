import java.util.ArrayList;

//	This is a change that is for GitHub practice
public class FizzBuzz
	{
	static ArrayList<String> listToPrint = new ArrayList();
	
	public static void main(String[] args)
		{
		for (int i=1;i<=15;i++)
			{
			listToPrint.add(String.valueOf(i));
			System.out.println(listToPrint);

			if ((i%3 == 0) && (i%5 != 0))
				{
				listToPrint.set(i,"fizz");
				}
			if ((i%5 == 0) && (i%3 != 0))
				{
				listToPrint.set(i,"buzz");
				}
			if ((i%3 == 0) && (i%5 == 0))
				{
				listToPrint.set(i,"fizzbuzz");
				}
			}
			System.out.println(listToPrint);
		}
	}

	
