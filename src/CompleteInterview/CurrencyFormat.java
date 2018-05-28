package CompleteInterview;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {

	public static void main(String[] args) {
        double payment=1963.2378;
        String local = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String canada = NumberFormat.getCurrencyInstance(Locale.CANADA).format(payment);
        String ITALY = NumberFormat.getCurrencyInstance(Locale.ITALY).format(payment);
        String eng = NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(payment);
        System.out.println(local);
        System.out.println(eng);
        
	}

}
