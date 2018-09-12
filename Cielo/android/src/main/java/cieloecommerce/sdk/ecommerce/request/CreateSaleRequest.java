package cieloecommerce.sdk.ecommerce.request;

import android.util.Log;

import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URL;

import cieloecommerce.sdk.Environment;
import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.Sale;

/**
 * Create any kind of sale
 */
public class CreateSaleRequest extends AbstractSaleRequest<Sale, Sale> {
    public CreateSaleRequest(Merchant merchant, Environment environment) {
        super(merchant, environment, Sale.class);
    }

    @Override
    protected Sale doInBackground(Sale... params) {
        Sale sale = null;

        try {
            URL url = new URL(environment.getApiUrl() + "1/sales/");

            sale = sendRequest("POST", url, new GsonBuilder().create().toJson(params[0]));
        } catch (IOException e) {
            Log.e("Cielo SDK", e.getLocalizedMessage(), e);
        }

        return sale;
    }
}
