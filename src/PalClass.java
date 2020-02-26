import java.time.LocalDate;

import com.sun.org.apache.xpath.internal.operations.Plus;

public class PalClass {

	public static void main(String[] args) {
		String x="20200202";
		String y="Otto";
		String z="Ebene";
		LocalDate today=LocalDate.now();
		System.out.println("heute ist der "+today);
		System.out.println(x+" -> "+palSuche(x));
		System.out.println(y+" -> "+palSuche(y));
		System.out.println(z+" -> "+palSuche(z));
		LocalDate ld = LocalDate.EPOCH;
		System.out.println("willk�rliches datum : "+ld.toString());
		String datePast="19000101";
//		fragen wie des gemacht werden soll
//		palSucheEwig(datePast);
		
//		rip irgednwie... heeelp
//		palSuche(x,1);	
		
	}

	private static boolean palSuche(String x, int i) {
		if(x.length()>=9) {
			System.out.println("Das Datum darf nur 8 Zahlen lang sein!!!");
		} else if (i==1) {
			String c = x.toLowerCase();
		    int l = c.length()-1;
		    int f = 0;
		    while (l > f) {
		        char forwardChar = c.charAt(f++);
		        char backwardChar = c.charAt(l--);
		        System.out.println(forwardChar);
		        System.out.println(backwardChar);
		        if (forwardChar != backwardChar)
		            return false;
		    }
		    return true;
		}
		return false;
	}

	private static boolean palSuche(String t) {	//ohne Rekursion
		String c = t.toLowerCase();
	    int l = c.length()-1;
	    int f = 0;
	    while (l > f) {
	        char forwardChar = c.charAt(f++);
	        char backwardChar = c.charAt(l--);
	        System.out.println(forwardChar);
	        System.out.println(backwardChar);
	        if (forwardChar != backwardChar)
	            return false;
	    }
	    return true;
	}
	
	private static void palSucheEwig(String date) {
		do {
			String c = date.toLowerCase();
		    int l = c.length()-1;
		    int f = 0;
		    while (l > f) {
		        char forwardChar = c.charAt(f++);
		        char backwardChar = c.charAt(l--);
		        System.out.println(forwardChar);
		        System.out.println(backwardChar);
		        if (forwardChar != backwardChar)
		            break;
		    }
		    System.out.println(date);
		    
		} while (date != "2100-12-31");
	}
}
