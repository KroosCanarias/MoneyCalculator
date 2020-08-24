
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetExchangeRate {
    
    public static double getExchangeRate(Currency from, Currency to) throws IOException {
        URL url = 
            new URL("http://free.currencyconverterapi.com/api/v5/convert?q=" +
                    from.getCurrency() + "_" + to.getCurrency() + "&compact=ultra&apiKey=906f8fa8676a057c595a");
        URLConnection connection = url.openConnection();
        try (BufferedReader reader = 
                new BufferedReader(
                        new InputStreamReader(connection.getInputStream()))) {
            String line = reader.readLine();
            String line1 = line.substring(line.lastIndexOf(to.getCurrency())+5
                    , line.indexOf("}"));
            System.out.print(from.getCurrency());
            return Double.parseDouble(line1);
        }
    }
}
