package cieloecommerce.sdk.ecommerce.request;

import android.util.Log;

import java.io.IOException;
import java.net.URL;

import cieloecommerce.sdk.Environment;
import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.Sale;

/**
 * Query a Sale by it's paymentId
 */
public class QuerySaleRequest extends AbstractSaleRequest<String, Sale> {
    public QuerySaleRequest(Merchant merchant, Environment environment) {
        super(merchant, environment, Sale.class);
    }

    @Override
    protected Sale doInBackground(String... params) {
        Sale sale = null;
        String paymentId = params[0];

        try {
            URL url = new URL(environment.getApiQueryURL() + "1/sales/" + paymentId);

            sale = sendRequest("GET", url);
        } catch (IOException e) {
            Log.e("Cielo SDK", e.getLocalizedMessage(), e);
        }

        return sale;
    }
}