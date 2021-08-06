package string;

public class SubSequence {
	public  boolean isSubSequence(String str, String seq){
        int i = 0; // traverse str "abcde"
        int j = 0; // traverse seq "aec" or "ace"

        while(i < str.length() && j < seq.length()){
             if(str.charAt(i) == seq.charAt(j)){
                 j++;
             }
             i++;
        }
        return j == seq.length();
		
    }
	public static void main(String[] args) {
		
		SubSequence sb= new SubSequence();
	String st= "abcde";
	String seq="aec";
	System.out.println(sb.isSubSequence(st, seq));
	}
}
