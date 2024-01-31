package String_Operations;

public class String_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		
		//charAt method
		System.out.println(s.charAt(3));
		
		//length
		System.out.println(s.length());
		
		//to lower case
		System.out.println(s.toLowerCase());
		
		//to upper case
		System.out.println(s.toUpperCase());
		
		//replace method
		System.out.println(s.replace('e', 'o'));
		
		// index od
		System.out.println(s.indexOf('o'));
		
		// is empty
		System.out.println(s.isEmpty());
		
		//substring
		System.out.println(s.substring(3));
		
		// contains
		System.out.println(s.contains("llu"));
		
		//starts with
		System.out.println(s.startsWith("he"));
		
		// ends with
		System.out.println(s.endsWith("lo"));
		
		
		String s1 = "Welcome";
		String s2 = "Home";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.concat(s2));
		
		
		
		
	}

}
