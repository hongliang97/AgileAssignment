/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.io.Serializable;
import java.sql.*;
import java.util.Objects;
/**
 *
 * @author liang
 */
public class CustomerMaintenanceInvoicePayment implements Serializable{
    private String custID;
    private String custName;
    private String category;
    private char gender;
    private Date dob;
    private String custPhone;
    private String address;
    private double creditLimit;

    public CustomerMaintenanceInvoicePayment(String custID, String custName, String category, char gender, Date dob, String custPhone, String address, double creditLimit) {
        this.custID = custID;
        this.custName = custName;
        this.category = category;
        this.gender = gender;
        this.dob = dob;
        this.custPhone = custPhone;
        this.address = address;
        this.creditLimit = creditLimit;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.custID);
        hash = 79 * hash + Objects.hashCode(this.custName);
        hash = 79 * hash + Objects.hashCode(this.category);
        hash = 79 * hash + this.gender;
        hash = 79 * hash + Objects.hashCode(this.dob);
        hash = 79 * hash + Objects.hashCode(this.custPhone);
        hash = 79 * hash + Objects.hashCode(this.address);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.creditLimit) ^ (Double.doubleToLongBits(this.creditLimit) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CustomerMaintenanceInvoicePayment other = (CustomerMaintenanceInvoicePayment) obj;
        if (this.gender != other.gender) {
            return false;
        }
        if (Double.doubleToLongBits(this.creditLimit) != Double.doubleToLongBits(other.creditLimit)) {
            return false;
        }
        if (!Objects.equals(this.custID, other.custID)) {
            return false;
        }
        if (!Objects.equals(this.custName, other.custName)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.custPhone, other.custPhone)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "ID= " + custID + "\nName= " + custName + "\nCategory= " + category + "\nGender= " + gender + "\nDate of Birth= " + dob + "\nPhone= " + custPhone + "\nAddress= " + address + "\nCreditLimit= " + creditLimit ;
    }



    
}
