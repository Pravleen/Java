package strings;

public class StrinIntro {

	public static void main(String[] args) {
		String s="Pravleen";
		String s1="   Ishika   ";
		String s3="";
		String s4="Hi my name is Pravleen";
		String another=new String("Ishika");
		System.out.println(s);
		System.out.println(another);
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.substring(4));
		System.out.println(s.substring(2,7));
		System.out.println(s.contains("P"));
		System.out.println(s.equals(s1));
		System.out.println(s.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println(s.concat(s1));
		System.out.println(s.replace('e', 'i'));
		String[] s5=s4.split(" ");
		for(String word:s5) {
			System.out.println(word+" ");
		}
		System.out.println(s.indexOf('n'));
		System.out.println(s1.trim());

	}

}
