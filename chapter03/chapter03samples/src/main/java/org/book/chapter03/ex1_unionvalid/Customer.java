package org.book.chapter03.ex1_unionvalid;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Customer {

    @Email
    private String userId;
    @NotNull @Size(min = 4, max = 50, message = "Firstname should be between {min} and {max}")
    private String firstName;
    private String lastName;
    @Email(message = "Email is not a valid email address")
    private String recoveryEmail;
    private String phoneNumber;
    private Date dob;
    @Min(value = 18, message = "Customer must be over 18 years old")
    private Integer age;
    private Date creationDate;

    public Customer() {
    }

    public Customer(String userId, String firstName, String lastName, String recoveryEmail,
                    String phoneNumber, Date dob, Integer age, Date creationDate) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.recoveryEmail = recoveryEmail;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.age = age;
        this.creationDate = creationDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getRecoveryEmail() {
        return recoveryEmail;
    }

    public void setRecoveryEmail(String recoveryEmail) {
        this.recoveryEmail = recoveryEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
