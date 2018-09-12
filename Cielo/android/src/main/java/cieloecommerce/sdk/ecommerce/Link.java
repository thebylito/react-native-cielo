package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class Link {

    @SerializedName("Method")
    private String method;

    @SerializedName("Rel")
    private String rel;

    @SerializedName("Href")
    private String href;

    public Link() {
    }

    public Link(String method, String rel, String href) {
        this.method = method;
        this.rel = rel;
        this.href = href;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
