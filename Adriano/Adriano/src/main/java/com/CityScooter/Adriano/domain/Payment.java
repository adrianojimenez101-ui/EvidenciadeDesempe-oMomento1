package com.CityScooter.Adriano.domain;

import java.time.LocalDate;

public class Payment {

    private int idPayment;
    private double amount;
    private LocalDate paymentDate;
    private String status;
    private Booking booking;

    public Payment() {}

    public Payment(int idPayment, double amount, LocalDate paymentDate, String status, Booking booking) {
        this.idPayment = idPayment;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.status = status;
        this.booking = booking;
    }

    public int getIdPayment() {return idPayment;}
    public void setIdPayment(int idPayment) {this.idPayment = idPayment;}

    public double getAmount() {return amount;}
    public void setAmount(double amount) {this.amount = amount;}

    public LocalDate getPaymentDate() {return paymentDate;}
    public void setPaymentDate(LocalDate paymentDate) {this.paymentDate = paymentDate;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public Booking getBooking() {return booking;}
    public void setBooking(Booking booking) {this.booking = booking;}

    @Override
    public String toString() {
        return "Payment{" +
                "idPayment=" + idPayment +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", status='" + status + '\'' +
                ", booking=" + booking +
                '}';
    }
}