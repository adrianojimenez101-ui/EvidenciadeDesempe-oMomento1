package com.CityScooter.Adriano.domain;

import java.time.LocalDateTime;

public class Booking {

    private int idBooking;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private double totalCost;
    private double distance;
    private int duration;
    private User user;
    private Vehicle vehicle;
    private PaymentMethod paymentMethod;

    public Booking() {}

    public Booking(int idBooking, LocalDateTime startTime, LocalDateTime endTime,
                   String status, double totalCost, double distance, int duration,
                   User user, Vehicle vehicle, PaymentMethod paymentMethod) {
        this.idBooking = idBooking;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.totalCost = totalCost;
        this.distance = distance;
        this.duration = duration;
        this.user = user;
        this.vehicle = vehicle;
        this.paymentMethod = paymentMethod;
    }

    public int getIdBooking() {return idBooking;}
    public void setIdBooking(int idBooking) {this.idBooking = idBooking;}

    public LocalDateTime getStartTime() {return startTime;}
    public void setStartTime(LocalDateTime startTime) {this.startTime = startTime;}

    public LocalDateTime getEndTime() {return endTime;}
    public void setEndTime(LocalDateTime endTime) {this.endTime = endTime;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public double getTotalCost() {return totalCost;}
    public void setTotalCost(double totalCost) {this.totalCost = totalCost;}

    public double getDistance() {return distance;}
    public void setDistance(double distance) {this.distance = distance;}

    public int getDuration() {return duration;}
    public void setDuration(int duration) {this.duration = duration;}

    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}

    public Vehicle getVehicle() {return vehicle;}
    public void setVehicle(Vehicle vehicle) {this.vehicle = vehicle;}

    public PaymentMethod getPaymentMethod() {return paymentMethod;}
    public void setPaymentMethod(PaymentMethod paymentMethod) {this.paymentMethod = paymentMethod;}

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                ", totalCost=" + totalCost +
                ", distance=" + distance +
                ", duration=" + duration +
                ", user=" + user +
                ", vehicle=" + vehicle +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
