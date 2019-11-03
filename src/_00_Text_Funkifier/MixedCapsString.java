package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 1) {
				newString += s.substring(i, i + 1).toUpperCase();
			} else {
				newString += s.substring(i, i + 1).toLowerCase();
			}
		}
		return newString;
	}

}
