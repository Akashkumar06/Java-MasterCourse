import java.util.Scanner;

public class Top
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//Taking rows value from the user

		System.out.println(&quot;How many rows you want in this pattern?&quot;);

		int rows = sc.nextInt();

		System.out.println(&quot;Here is your pattern....!!!&quot;);

		for (int i = rows; i &gt;= 1; i--)
		{
			for (int j = 1; j &lt;= i; j++)
			{
				System.out.print(j+&quot; &quot;);
			}

			System.out.println();
		}

		//Closing the resources

		sc.close();
	}