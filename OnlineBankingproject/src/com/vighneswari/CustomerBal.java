package com.vighneswari;
import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Key;
@PersistenceCapable(detachable="true")
public class CustomerBal 
{


@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	 public Key getKey() {
	        return key;
	    }
	    public void setKey(Key key)
	    {
	    	this.key=key;
	    }
	@Persistent
    private String name;
    @Persistent
    private String Mobile;
    @Persistent
    private String AccountType;
    @PrimaryKey
    @Persistent
    private String AccountNumber;
    @Persistent
    private int Balance=0;
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getMobile()
    {
        return Mobile;
    }

    public void setMobile(String Mobile) 
    {
        this.Mobile = Mobile;
    }
        public String getAccountType() 
        {
            return AccountType;
        }
        public void setAccountType(String AccountType) 
        {
            this.AccountType = AccountType;
        }
        
            public String getAccountNumber() 
            {
                return AccountNumber;
            }
            public void setAccountNumber(String AccountNumber) 
            {
                this.AccountNumber = AccountNumber;
            } 
            public int getBalance() {
                return Balance;
            }
            public void setBalance(int Balance)
            {
                this.Balance =Balance;
            }
}
