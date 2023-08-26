package firstpkg;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String s="i am";
		String t="Rahul";
		
		//concat:
		
		System.out.println(s.concat(t));
		System.out.println(1+2+s+5+2);
		
		//equals:
		
		
		System.out.println(s.equals(t));
		System.out.println(s.equalsIgnoreCase(t));
		
		//tolowercase and uppercase
		
		System.out.println(s.toUpperCase());
		System.out.println(t.toLowerCase());
		
		//trim:
		
		System.out.println(s.trim());
		
		//contains:
		
		System.out.println(s.contains("i"));
		
		//length:
		
		System.out.println(s.length());
		
		//substring:
		
		System.out.println(s.substring(1,4));
		
		//startswith and endswith:
		
		System.out.println(s.startsWith("i"));
		System.out.println(t.endsWith("l"));
		
		//charat:
		System.out.println(s.charAt(1));
		
		//split:
		String s1="hello iam rahul";
		String[] str=s1.split(" ");
		for(String value:str)
		{
			System.out.println(value);
		}
		
		//replace:
		System.out.println(s.replace("i am","I am"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
