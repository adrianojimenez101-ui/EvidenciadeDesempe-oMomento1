package com.CityScooter.Adriano.domain;

import java.time.LocalDate;

public class Customer extends User {

    private String drivingLicense;
    private LocalDate licenseExpirationDate;
    private double balance;
    private double rating;
    private int totalTrips;

    public Customer() {super();}

    public Customer(int idUser, String name, String lastName, String email,
                    String password, String phone, String address, String identityDocument,
                    String role, boolean status,
                    String drivingLicense, LocalDate licenseExpirationDate,
                    double balance, double rating, int totalTrips) {

        super(idUser, name, lastName, email, password, phone, address, identityDocument, role, status);

        this.drivingLicense = drivingLicense;
        this.licenseExpirationDate = licenseExpirationDate;
        this.balance = balance;
        this.rating = rating;
        this.totalTrips = totalTrips;
    }

    public String getDrivingLicense() {return drivingLicense;}
    public void setDrivingLicense(String drivingLicense) {this.drivingLicense = drivingLicense;}

    public LocalDate getLicenseExpirationDate() {return licenseExpirationDate;}
    public void setLicenseExpirationDate(LocalDate licenseExpirationDate) {this.licenseExpirationDate = licenseExpirationDate;}

    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}

    public double getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}

    public int getTotalTrips() {return totalTrips;}
    public void setTotalTrips(int totalTrips) {this.totalTrips = totalTrips;}

    @Override
    public String toString() {
        return "Customer{" +
                "drivingLicense='" + drivingLicense + '\'' +
                ", licenseExpirationDate=" + licenseExpirationDate +
                ", balance=" + balance +
                ", rating=" + rating +
                ", totalTrips=" + totalTrips +
                '}';
    }
}