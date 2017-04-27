package com.vighneswari;

import java.io.Serializable;
import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.Entity;
import javax.jdo.identity.StringIdentity;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class Bank 
{
   

	DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
	 @PrimaryKey
	 @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	 private Key key;
	
    @Persistent
    private String name;
	
    @Persistent 
    private String email;
    
    @Persistent
    private String Address;
    @Persistent
    private Date date;
    @Persistent
    private String Mobile;
    @Persistent
    private String Gender;
    @Persistent
    private String City;
    @Persistent
    private String AccountType;
    @Persistent
    private String AadharNumber;
   
   
    private String AccountNumber;
   
    @Persistent
    private String DateOfBirth;
    @Persistent
    private String Occupation;
    @Persistent
    private String Amount;
    @Persistent
    private int Balance=0;

    public Key getKey() {
        return key;
    }
    public void setKey(Key key)
    {
    	this.key=key;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    public String getAddress()
    {
    	return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    } 
    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String City) {
        this.City = City;
    }
    public String getAccountType() {
        return AccountType;
    }
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }
    public String getAadharNumber() {
        return AadharNumber;
    }
    public void setAadharNumber(String AadharNumber) {
        this.AadharNumber = AadharNumber;
    } 
    
    public String getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    } 
    public String getDateOfBirth() {
        return DateOfBirth;
    }
    public void setDataOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
    public String getOccupation() {
        return Occupation;
    }
    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }
    public String getAmount() {
        return Amount;
    }
    public void setAmount(String Amount) {
        this.Amount = Amount;
    } 
    public int getBalance() {
        return Balance;
    }
    public void setBalance(int Balance) {
        this.Balance =Balance;
    } 
    //getter and setter methods
    }
