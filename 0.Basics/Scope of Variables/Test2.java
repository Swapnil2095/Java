class Test2
{
	public static void main(String args[])
	{
		{
			int x = 5;
			{
				int x = 10;  //error ->variable x is already defined 
				System.out.println(x);
			}
		}
	}
}
