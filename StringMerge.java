public class MystDriver{
    public static void main(String[] args){
		
		String s1 = "Hello";
		String s2 = "World";
	    StringBuffer temp = new StringBuffer();
			for(int k=s2.length()-1;k>=0;k--){
				temp.append(s2.charAt(k));
			}
		System.out.println( s1 + temp.toString());



	}
}