
package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String newString = "";
		for (int i = s.length(); i > 0; i--) {
			newString += s.substring(i - 1, i);
		}
		
		return newString;
	}

}
