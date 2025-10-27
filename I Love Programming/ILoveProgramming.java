import java.util.Arrays;

public class ILoveProgramming {

	public static String[] splitIntoWords(String input) {
        
	return input.split(" ");
	}

	public static void main(String[] args) {

	String input = "I love programming";
	String[] words = splitIntoWords(input);
        
	System.out.println(Arrays.toString(words));
    }
}







