package assignmentPackage;
import java.util.Locale;
import java.util.Currency;
import java.text.NumberFormat;

public class Assignment4_3 {

	static void taskAB(double moneyDouble, String country) {
		Locale countryLocale = new Locale("en", country);
		Currency currency = Currency.getInstance(countryLocale);
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(countryLocale);
		
		System.out.println(countryLocale.getDisplayName());
		System.out.println(currency.getDisplayName());
		System.out.println(currencyFormatter.format(moneyDouble) + "\n");
	}
	
	static void taskC(String moneyString)
	{
		String filteredMoneyString = moneyString.replace(",", "");
		double moneyDouble = Double.parseDouble(filteredMoneyString);
		
		System.out.println(moneyString + " Converted From String to double: " + moneyDouble);
	}
	
	public static void main(String[] args)
	{
		double moneyDouble = 12345.678;
		String moneyString = "12,345.678";
		
		taskAB(moneyDouble, "GB");
		taskAB(moneyDouble, "US");
		taskC(moneyString);
		
	}
}
