import java.util.Scanner;

public class StringFreq{

		
		String sentence;
		char letter;
		Scanner input;

		public StringFreq()
		{

			input = new Scanner(System.in);
		}

		public void readSentence()
		{

			System.out.print("Enter a string : ");
			sentence = input.nextLine();
		}
		
		public void readLetter()
		{

			System.out.print("Enter a character : ");	
			letter = input.nextLine().charAt(0);

		}

		public void countFreq()
		{

			int count = 0;
			for(int i=0;i<sentence.length();i++)
			{
				if(sentence.charAt(i)==letter)
				{
					count++;
				}


			}
			System.out.println("The given letter occurs "+count+" number of times");

		}



	public static void main(String args[])
	{

		StringFreq sentence1 = new StringFreq();
		sentence1.readSentence();
		sentence1.readLetter();
		sentence1.countFreq();


	}

}
