package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class Payment {
    @SerializedName("ServiceTaxAmount")
    private Integer serviceTaxAmount;
    @SerializedName("Installments")
    private Integer installments;
    @SerializedName("Interest")
    private String interest;
    @SerializedName("Capture")
    private boolean capture = false;
    @SerializedName("Authenticate")
    private boolean authenticate = false;
    @SerializedName("Recurrent")
    private boolean recurrent;
    @SerializedName("RecurrentPayment")
    private RecurrentPayment recurrentPayment;
    @SerializedName("CreditCard")
    private Card creditCard;
    @SerializedName("DebitCard")
    private Card debitCard;
    @SerializedName("Tid")
    private String tid;
    @SerializedName("ProofOfSale")
    private String proofOfSale;
    @SerializedName("AuthorizationCode")
    private String authorizationCode;
    @SerializedName("SoftDescriptor")
    private String softDescriptor = "";
    @SerializedName("ReturnUrl")
    private String returnUrl;
    @SerializedName("AuthenticationUrl")
    private String authenticationUrl;
    @SerializedName("Provider")
    private Provider provider;
    @SerializedName("PaymentId")
    private String paymentId;
    @SerializedName("Type")
    private Type type;
    @SerializedName("Amount")
    private Integer amount;
    @SerializedName("ReceiveDate")
    private String receivedDate;
    @SerializedName("CapturedAmount")
    private Integer capturedAmount;
    @SerializedName("CapturedDate")
    private String capturedDate;
    @SerializedName("Currency")
    private Currency currency;
    @SerializedName("Country")
    private String country;
    @SerializedName("ReturnCode")
    private String returnCode;
    @SerializedName("ReturnMessage")
    private String returnMessage;
    @SerializedName("Status")
    private Integer status;
    @SerializedName("Links")
    private Link links[];
    @SerializedName("ExtraDataCollection")
    private Object extraDataCollection[];
    @SerializedName("ExpirationDate")
    private String expirationDate;
    @SerializedName("Url")
    private String url;
    @SerializedName("Number")
    private String number;
    @SerializedName("BarCodeNumber")
    private String barCodeNumber;
    @SerializedName("DigitableLine")
    private String digitableLine;
    @SerializedName("Address")
    private String address;

    public Payment(Integer amount, Integer installments) {
        setAmount(amount);
        setInstallments(installments);
    }

    public Payment(Integer amount) {
        this(amount, 1);
    }

    public Card creditCard(String securityCode, String brand) {
        setType(Type.CreditCard);
        setCreditCard(new Card(securityCode, brand));

        return getCreditCard();
    }

    public Card debitCard(String securityCode, String brand) {
        setType(Type.DebitCard);
        setDebitCard(new Card(securityCode, brand));

        return getDebitCard();
    }

    public RecurrentPayment recurrentPayment(boolean authorizeNow) {
        setRecurrentPayment(new RecurrentPayment(authorizeNow));

        return getRecurrentPayment();
    }

    public Integer getAmount() {
        return amount;
    }

    public Payment setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public boolean getAuthenticate() {
        return authenticate;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public Payment setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }

    public boolean getCapture() {
        return capture;
    }

    public Integer getCapturedAmount() {
        return capturedAmount;
    }

    public Payment setCapturedAmount(Integer capturedAmount) {
        this.capturedAmount = capturedAmount;
        return this;
    }

    public String getCapturedDate() {
        return capturedDate;
    }

    public Payment setCapturedDate(String capturedDate) {
        this.capturedDate = capturedDate;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Payment setCountry(String country) {
        this.country = country;
        return this;
    }

    public Card getCard(){
        return type == Type.CreditCard ? getCreditCard() : type == Type.DebitCard ? getDebitCard() : null;
    }

    public Card getCreditCard() {
        return creditCard;
    }

    public Payment setCreditCard(Card creditCard) {
        this.creditCard = creditCard;
        return this;
    }

    public Card getDebitCard() {
        return debitCard;
    }

    public Payment setDebitCard(Card debitCard) {
        this.debitCard = debitCard;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Payment setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public Integer getInstallments() {
        return installments;
    }

    public Payment setInstallments(Integer installments) {
        this.installments = installments;
        return this;
    }

    public String getInterest() {
        return interest;
    }

    public Payment setInterest(String interest) {
        this.interest = interest;
        return this;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public Payment setPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public String getProofOfSale() {
        return proofOfSale;
    }

    public Payment setProofOfSale(String proofOfSale) {
        this.proofOfSale = proofOfSale;
        return this;
    }

    public Provider getProvider() {
        return provider;
    }

    public Payment setProvider(Provider provider) {
        this.provider = provider;
        return this;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public Payment setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
        return this;
    }

    public boolean isRecurrent() {
        return recurrent;
    }

    public Payment setRecurrent(boolean recurrent) {
        this.recurrent = recurrent;
        return this;
    }

    public RecurrentPayment getRecurrentPayment() {
        return recurrentPayment;
    }

    public Payment setRecurrentPayment(RecurrentPayment recurrentPayment) {
        this.recurrentPayment = recurrentPayment;
        return this;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public Payment setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public Payment setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
        return this;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public Payment setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }

    public String getAuthenticationUrl() {
        return authenticationUrl;
    }

    public Payment setAuthenticationUrl(String authenticationUrl) {
        this.authenticationUrl = authenticationUrl;
        return this;
    }

    public Integer getServiceTaxAmount() {
        return serviceTaxAmount;
    }

    public Payment setServiceTaxAmount(Integer serviceTaxAmount) {
        this.serviceTaxAmount = serviceTaxAmount;
        return this;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public Payment setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Payment setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getTid() {
        return tid;
    }

    public Payment setTid(String tid) {
        this.tid = tid;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Payment setType(Type type) {
        this.type = type;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public boolean isAuthenticate() {
        return authenticate;
    }

    public Payment setAuthenticate(boolean authenticate) {
        this.authenticate = authenticate;
        return this;
    }

    public String getBarCodeNumber() {
        return barCodeNumber;
    }

    public boolean isCapture() {
        return capture;
    }

    public Payment setCapture(boolean capture) {
        this.capture = capture;
        return this;
    }

    public String getDigitableLine() {
        return digitableLine;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public Object[] getExtraDataCollection() {
        return extraDataCollection;
    }

    public Link[] getLinks() {
        return links;
    }

    public String getNumber() {
        return number;
    }

    public String getUrl() {
        return url;
    }

    public enum Provider {
        Bradesco,
        BancoDoBrasil,
        Simulado
    }

    public enum Type {
        CreditCard,
        DebitCard,
        ElectronicTransfer,
        Boleto
    }

    public enum Currency {
        BRL,
        USD,
        MXN,
        COP,
        CLP,
        ARS,
        PEN,
        EUR,
        PYN,
        UYU,
        VEB,
        VEF,
        GBP
    }
}