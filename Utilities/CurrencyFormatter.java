package Utilities;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

// Takes a long data type and convert it to a string with rupiah format
// See http://danangnurfauzi.net/function-currency-rupiah-java/
public class CurrencyFormatter{
    public static String rupiahFormat(long value){
        DecimalFormat toRupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols numberFormat = new DecimalFormatSymbols();

        numberFormat.setCurrencySymbol("Rp. ");
        numberFormat.setMonetaryDecimalSeparator(',');
        numberFormat.setGroupingSeparator('.');

        toRupiah.setDecimalFormatSymbols(numberFormat);
        String result = toRupiah.format(Double.valueOf(value));
        return result;
    }
}

