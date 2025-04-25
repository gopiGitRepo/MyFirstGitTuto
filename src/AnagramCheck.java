package interview_string;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "anagramm";
        String str2 = "marganaa";

        boolean isAnagram = areAnagrams(str1, str2);

        if (isAnagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

	private static boolean areAnagrams(String str1, String str2) {
		boolean isAnagram = false;
		if(str1.length() != str2.length()) {
			return isAnagram;
		}
		
		String sorted1 = str1.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		
		String sorted2 = str2.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		
		if(sorted1.equals(sorted2)) {
			isAnagram = true;
		}
		return isAnagram;
	}

    
}
