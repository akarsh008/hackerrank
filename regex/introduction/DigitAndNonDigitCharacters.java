// Matching Digits & Non-Digit Characters
// Matches pattern xxXxxXxxxx
// 	Where x denotes a digit character
// 		  X denotes a non-digit character
import java.util.*;
import java.util.regex.*;

public class DigitAndNonDigitCharacters {

		public static void main(String[] args) {
			
			Regex_Test tester = new Regex_Test();
			tester.checker("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d");
		}
}

class Regex_Test {

	public void checker(String Regex_Pattern) {
		
		Scanner Input = new Scanner(System.in);
		String Test_String = Input.nextLine();
		Pattern p = Pattern.compile(Regex_Pattern);
		Matcher m = p.matcher(Test_String);
		System.out.println(m.find());
	}
}
