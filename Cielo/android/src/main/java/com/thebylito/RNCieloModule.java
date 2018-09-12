
package com.thebylito;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.concurrent.ExecutionException;

import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.Address;
import cieloecommerce.sdk.ecommerce.CieloEcommerce;
import cieloecommerce.sdk.ecommerce.Customer;
import cieloecommerce.sdk.ecommerce.Environment;
import cieloecommerce.sdk.ecommerce.Payment;
import cieloecommerce.sdk.ecommerce.Sale;
import cieloecommerce.sdk.ecommerce.request.CieloError;
import cieloecommerce.sdk.ecommerce.request.CieloRequestException;
import cieloecommerce.sdk.ecommerce.request.UpdateSaleResponse;

public class RNCieloModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNCieloModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNCielo";
    }

    @ReactMethod
    public void acao() {
        Merchant merchant = new Merchant("319457c6-0536-4954-a8bd-a75ddf2a1694", "BXSPPSHQJQANQIIGEHYSGBHUXTZSCKXTHLQQSIDZ");

        Sale sale = new Sale("123");

        Address endereco = new Address().
                setCity("Campo Grande")//Cidade
                .setNumber("732")// Numero
                .setStreet("Avenida Marechal Camara")//Rua
                .setState("MS")//Estado
                .setZipCode("79093150")//Codigo Postal
                .setCountry("BR")//Pais
                .setComplement("Complemento qualquer")//Complemento
                .setDistrict("Centro");//Bairro

        Customer customer = sale.customer("Welington da Silva")
                .setAddress(endereco)
                .setIdentity("CPF", "1234567890")
                .setBirthDate("1995-05-30").setEmail("thebylito@gmail.com");

        Payment payment = sale.payment(15700);


        payment.creditCard("123", "Visa")
                .setExpirationDate("12/2018")
                .setCardNumber("0000000000000001")
                .setHolder("Fulano de Tal");

        //BOLETO
       // payment.setType(Payment.Type.Boleto);


        try {
            sale = new CieloEcommerce(merchant, Environment.SANDBOX).createSale(sale);
            String paymentId = sale.getPayment().getPaymentId();

            //BOLETO
            //String paymentId = sale.getPayment().getBarCodeNumber();

            Log.d("Cielo", paymentId);

            UpdateSaleResponse captura = new CieloEcommerce(merchant, Environment.SANDBOX).captureSale(paymentId, 15700, 0);
            Log.v("Cielo", captura.toString());

            //sale = new CieloEcommerce(merchant, Environment.SANDBOX).cancelSale(paymentId, 15700);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } catch (CieloRequestException e) {
            CieloError error = e.getError();

            Log.v("Cielo", error.getCode().toString());
            Log.v("Cielo", error.getMessage());
            if (error.getCode() != 404) {
                Log.e("Cielo", null, e);
            }
        }

    }

}