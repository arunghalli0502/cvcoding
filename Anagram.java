class Anagram
{
	public boolean checkanagram(sentence)
	{
		Hashset<Character> hs= new Hashset<>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = s.charAt(i).toLowerCase();
            if (Character.isLetter(c)) {
                hs.add(c);
            }
        }

        return hs.size() == 26;
	}



	public static void main(String[] args)
	{
		Scanner s= new Scanner();
		System.out.println("Enter the string needs to checked : ");
		String str = s.nextLine();
		// String s = "The quick brown fox jumps over the lazy dog";
		
		if(checkanagram(str))
		{
			System.out.println("sentence is anagram");
		}
		else
		{
			System.out.println("sentence is NOT anagram");
		}

	}
}
