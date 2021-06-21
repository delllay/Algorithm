package codewars;

//https://www.codewars.com/kata/52fba66badcd10859f00097e
public class kata7_troll {
	public static void main(String[] args) {
		System.out.println(disemvowel("This website is for losers LOL!"));
		System.out.println("Ths wbst s fr lsrs LL!".equals(disemvowel("This website is for losers LOL!")));
	}

	public static String disemvowel(String str) {
		return str.replaceAll("[aeiouAEIOU]", "");
	}
}
