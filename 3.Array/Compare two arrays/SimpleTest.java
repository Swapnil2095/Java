class SimpleTest
{
	public static void main (String[] args) 
	{
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};
		if (arr1 == arr2) // Same as arr1.equals(arr2)
			System.out.println("Same");
		else
			System.out.println("Not same");
	}
}
