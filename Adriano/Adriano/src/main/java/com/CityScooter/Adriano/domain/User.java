package com.CityScooter.Adriano.domain;

public class User {

    private int idUser;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String identityDocument;
    private String role;
    private boolean status;

    public User(int idUser, String name, String lastName, String email,
                String password, String phone, String address, String identityDocument,
                String role, boolean status) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.identityDocument = identityDocument;
        this.role = role;
        this.status = status;
    }

    public int getIdUser() {return idUser;}
    public void setIdUser(int idUser) {this.idUser = idUser;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getIdentityDocument() {return identityDocument;}
    public void setIdentityDocument(String identityDocument) {this.identityDocument = identityDocument;}

    public String getRole() {return role;}
    public void setRole(String role) {this.role = role;}

    public boolean isStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", identityDocument='" + identityDocument + '\'' +
                ", role='" + role + '\'' +
                ", status=" + status +
                '}';
    }
}
