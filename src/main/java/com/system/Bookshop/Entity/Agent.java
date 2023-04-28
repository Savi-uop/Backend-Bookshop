package com.system.Bookshop.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "agent")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "nic")
    private String nic;

    @Column(name = "dob")
    private java.sql.Date dob;

    @Column(name = "address_line1")
    private String address_line1;

    @Column(name = "address_line2")
    private String address_line2;

    @Column(name = "address_line3")
    private String address_line3;

    @Column(name = "contact")
    private String contact;

//    @Column(name = "supplier")
//    private int supplier;

//working one
//    @ManyToOne(fetch = FetchType.LAZY)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplier_id",referencedColumnName ="id")
    private Supplier supplier_id;
// @JoinColumn(name = "sup_id",referencedColumnName ="supplier")

    public Agent() {

    }

//    public Agent(int id, String fname, String lname, String nic, Date dob, String address_line1, String address_line2, String address_line3, Supplier supplier) {
//        this.id = id;
//        this.fname = fname;
//        this.lname = lname;
//        this.nic = nic;
//        this.dob = dob;
//        this.address_line1 = address_line1;
//        this.address_line2 = address_line2;
//        this.address_line3 = address_line3;
//        this.supplier = supplier;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(java.sql.Date dob) {
        this.dob = dob;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getAddress_line3() {
        return address_line3;
    }

    public void setAddress_line3(String address_line3) {
        this.address_line3 = address_line3;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
//

    public Supplier getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Supplier supplier_id) {
        this.supplier_id = supplier_id;
    }



}
