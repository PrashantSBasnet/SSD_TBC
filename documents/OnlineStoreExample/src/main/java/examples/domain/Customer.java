package examples.domain;

import java.util.Calendar;
import java.util.Date;

public class Customer {

    private String customerId;
    private String name;
    private String emailAddress;
    private Date dateOfBirth;
    private Address address;

    private int age;

    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        //Lazy-load age when it's needed.
        if (age == 0) {
            Calendar birthCalendar = Calendar.getInstance();
            birthCalendar.setTime(dateOfBirth);

            Calendar now = Calendar.getInstance();

            age = now.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);
        }

        return age;
    }
}
