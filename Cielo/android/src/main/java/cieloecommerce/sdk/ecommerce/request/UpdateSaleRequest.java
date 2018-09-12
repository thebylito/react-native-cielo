package cieloecommerce.sdk.ecommerce.request;

import android.net.Uri;
import android.util.Log;
import cieloecommerce.sdk.Environment;
import cieloecommerce.sdk.Merchant;

import java.io.IOException;
import java.net.URL;

/**
 * Capture or cancel a Sale
 */
public class UpdateSaleRequest extends AbstractSaleRequest<String, UpdateSaleResponse> {
    private final String type;
    private Integer amount;
    private Integer serviceTaxAmount;

    public UpdateSaleRequest(String type, Merchant merchant, Environment environment) {
        super(merchant, environment, UpdateSaleResponse.class);

        this.type = type;
    }

    @Override
    protected UpdateSaleResponse doInBackground(String... params) {
        UpdateSaleResponse sale = null;
        String paymentId = params[0];

        try {
            Uri.Builder uri = Uri.parse(environment.getApiUrl() + "1/sales/" + paymentId).buildUpon();

            uri.appendPath(type);

            if (amount != null) {
                uri.appendQueryParameter("amount", amount.toString());
            }

            if (serviceTaxAmount != null) {
                uri.appendQueryParameter("serviceTaxAmount", serviceTaxAmount.toString());
            }

            URL url = new URL(uri.build().toString());

            sale = sendRequest("PUT", url);
        } catch (IOException e) {
            Log.e("Cielo SDK", e.getLocalizedMessage(), e);
        }

        return sale;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setServiceTaxAmount(Integer serviceTaxAmount) {
        this.serviceTaxAmount = serviceTaxAmount;
    }

    public static class UpdateType {

        public static final String VOID = "void";
        public static final String CAPTURE = "capture";

    }
}