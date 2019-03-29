package syntax;

public class Class3 {

	public static void main(String[] args) {
		/*String arr = "hollywood is so far";
		System.out.println(arr.charAt(6));
		System.out.println(arr.contains(" "));
		System.out.println(arr.endsWith("far"));
		System.out.println(arr.lastIndexOf("o"));
		System.out.println(arr.concat(" away"));
		System.out.println(arr.compareTo("hollywood"));
		System.out.println(arr.replace('o', 'i'));
		System.out.println(arr.substring(arr.length()/2));
		System.out.println(arr.toUpperCase());
		System.out.println(arr.toString());*/
		
		
		int[][] ar = { { 2, 6, 9, 3, 7 }, 
				       { 1, 7, 9, 4, 8 }, 
				       { 0, 4, 6, 2, 5 }, 
				       { 0, 1, 2, 3, 9 } };
		
		for (int[] inner:ar) {
			for(int numbers:inner) {
				System.out.print(numbers+ " / ");
			}
			System.out.println("\n"+"-------------------");
		}
	}
}
