package cieloecommerce.sdk.ecommerce.request;

import cieloecommerce.sdk.ecommerce.Link;
import com.google.gson.annotations.SerializedName;

public class UpdateSaleResponse {

    @SerializedName("Status")
    private Integer status;

    @SerializedName("ReasonCode")
    private Integer reasonCode;

    @SerializedName("ReasonMessage")
    private String reasonMessage;

    @SerializedName("ProviderReturnCode")
    private String providerReturnCode;

    @SerializedName("ProviderReturnMessage")
    private String providerReturnMessage;

    @SerializedName("ReturnCode")
    private String returnCode;

    @SerializedName("ReturnMessage")
    private String returnMessage;

    @SerializedName("Links")
    private Link[] links;

    public UpdateSaleResponse() {
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getReasonCode() {
        return reasonCode;
    }

    public String getReasonMessage() {
        return reasonMessage;
    }

    public String getProviderReturnCode() {
        return providerReturnCode;
    }

    public String getProviderReturnMessage() {
        return providerReturnMessage;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public Link[] getLinks() {
        return links;
    }
}
