package com.CityScooter.Adriano.domain;

import java.time.LocalDate;

public class PaymentMethod {

    private int idPaymentMethod;
    private String type;
    private String cardNumber;
    private LocalDate expirationDate;
    private String cvv;
    private String cardHolderName;
    private String billingAddress;
    private boolean isDefault;
    private boolean status;

    public PaymentMethod() {}

    public PaymentMethod(int idPaymentMethod, String type, String cardNumber,
                         LocalDate expirationDate, String cvv, String cardHolderName,
                         String billingAddress, boolean isDefault, boolean status) {
        this.idPaymentMethod = idPaymentMethod;
        this.type = type;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
        this.billingAddress = billingAddress;
        this.isDefault = isDefault;
        this.status = status;
    }

    public int getIdPaymentMethod() {return idPaymentMethod;}
    public void setIdPaymentMethod(int idPaymentMethod) {this.idPaymentMethod = idPaymentMethod;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public String getCardNumber() {return cardNumber;}
    public void setCardNumber(String cardNumber) {this.cardNumber = cardNumber;}

    public LocalDate getExpirationDate() {return expirationDate;}
    public void setExpirationDate(LocalDate expirationDate) {this.expirationDate = expirationDate;}

    public String getCvv() {return cvv;}
    public void setCvv(String cvv) {this.cvv = cvv;}

    public String getCardHolderName() {return cardHolderName;}
    public void setCardHolderName(String cardHolderName) {this.cardHolderName = cardHolderName;}

    public String getBillingAddress() {return billingAddress;}
    public void setBillingAddress(String billingAddress) {this.billingAddress = billingAddress;}

    public boolean isDefault() {return isDefault;}
    public void setDefault(boolean isDefault) {this.isDefault = isDefault;}

    public boolean isStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "idPaymentMethod=" + idPaymentMethod +
                ", type='" + type + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expirationDate=" + expirationDate +
                ", cvv='" + cvv + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", isDefault=" + isDefault +
                ", status=" + status +
                '}';
    }
}