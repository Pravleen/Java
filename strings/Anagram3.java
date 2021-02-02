package strings;

public class Anagram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="cat";
		String b="acto";
		boolean isAnagram=true;
		int al[]=new int[256];
//		int bl[]=new int[256];
		
		for(char c:a.toCharArray()) {
			int index=(int) c;
			al[index]=+1;
		}
		for(char c:b.toCharArray()) {
			int index=(int) c;
//			bl[index]=+1;
			al[index]--;
		}
		for(int i=0;i<256;i++) {
			if(al[i]!=0) {
				isAnagram=false;
				break;
			}
			
		}
		if(isAnagram) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram");
		}


	}

}
