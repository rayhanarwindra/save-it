package Utilities;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

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

