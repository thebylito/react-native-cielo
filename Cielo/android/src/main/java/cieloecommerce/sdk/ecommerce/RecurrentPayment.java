package cieloecommerce.sdk.ecommerce;

public class RecurrentPayment {
    private boolean authorizeNow;
    private String endDate;
    private Interval interval;

    public RecurrentPayment(boolean authorizeNow) {
        this.authorizeNow = authorizeNow;
    }

    public boolean isAuthorizeNow() {
        return authorizeNow;
    }

    public RecurrentPayment setAuthorizeNow(boolean authorizeNow) {
        this.authorizeNow = authorizeNow;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public RecurrentPayment setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Interval getInterval() {
        return interval;
    }

    public RecurrentPayment setInterval(Interval interval) {
        this.interval = interval;
        return this;
    }

    public enum Interval {
        Monthly,
        Bimonthly,
        Quarterly,
        SemiAnnual,
        Annual
    }
}