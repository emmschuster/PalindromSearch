import java.time.LocalDate;

public class PalClass {

	public static void main(String[] args) {
		String y="Otto";
		y.toLowerCase();
		String z="Peter";
		System.out.println(palSuche(y));
		System.out.println(palSuche(z));
		palSuche(z);
		LocalDate today=LocalDate.now();
		System.out.println(today);
	}

	private static boolean palSuche(String t) {	//ohne Rekursion
		String c = t.replaceAll("\\s+", "").toLowerCase();
	    int l = c.length();
	    int f = 0;
	    int b = l - 1;
	    while (b > f) {
	        char forwardChar = c.charAt(f++);
	        char backwardChar = c.charAt(b--);
	        if (forwardChar != backwardChar)
	            return false;
	    }
	    return true;
//		int xx=Integer.parseInt(x);
//		System.out.println(xx);
	}
	
//	private static boolean palSucheRek(String t) {	//Rekursion rip
//		String c=t.replaceAll("\\s+", "");
//		return false;	
//	}
}
