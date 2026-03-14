package com.CityScooter.Adriano.domain;

public class Admin extends User {

    private int adminLevel;
    private String department;

    public Admin() {super();}

    public Admin(int idUser, String name, String lastName, String email,
                 String password, String phone, String address, String identityDocument,
                 String role, boolean status,
                 int adminLevel, String department) {

        super(idUser, name, lastName, email, password, phone, address, identityDocument, role, status);

        this.adminLevel = adminLevel;
        this.department = department;
    }

    public int getAdminLevel() {return adminLevel;}
    public void setAdminLevel(int adminLevel) {this.adminLevel = adminLevel;}

    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}

    @Override
    public String toString() {
        return "Admin{" +
                "adminLevel=" + adminLevel +
                ", department='" + department + '\'' +
                '}';
    }
}