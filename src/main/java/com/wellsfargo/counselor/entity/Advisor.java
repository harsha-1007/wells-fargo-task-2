package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

@Entity
public class Client{

    @Id
    @GeneratedValue()
    private Long client_id;

    @Column(nullable=false)
    private String contact_information;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String email_id;

    @Column(nullable=false)
    private Long advisorId;

    protected Client( Long client_id,String contact_information,String name,String email_id,Long advisorId){
        this.client_id = client_id;
        this.contact_information = contact_information;
        this.name = name;
        this.email_id = email_id;
    }

    public Long getclientId(){
        return client_id;
    }

    public void setcontactinfo(String contact_information){
        this.contact_information=contact_information;
    }

    public String getcontactinfo(){
        return contact_information;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public void setemail(String email_id){
        this.email_id = email_id;
    }

    public String getemail(){
        return email_id;
    }
}

@Entity
public class Security{

    @Id
    @GeneratedValue()
    private Long Id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private String purchaseDate;

    @Column(nullable=false)
    private double purchasePrice;

    private Security(Long Id,String name,String category,String purchaseDate,double purchasePrice){
        this.Id = Id;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    public Long Id(){
        return Id;
    }

    public void setname(String name){
        this.name=name;
    }

    public String getname(){
        return name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void purchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public String getPurchasedate(){
        return purchaseDate;
    }

    public void setPurchasePrice(double purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public double getPurchasePrice(){
        return purchasePrice;
    }
 }
