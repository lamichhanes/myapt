package com.storage.unit.models.customer;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String email;
    private  String firstName;
    private  String lastName;
    private  String phoneNumber;

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
//    public CustomerInfo(CustomerInfoBuilder builder) {
//        this.id = builder.id;
//        this.email = builder.email;
//        this.firstName = builder.firstName;
//        this.lastName = builder.lastName;
//        this.phoneNumber = builder.phoneNumber;
//    }
//
//    public String getId() {
//        return this.id;
//    }
//
//    public String getEmail() {
//        return this.email;
//    }
//
//    public String getFirstName() {
//        return this.firstName;
//    }
//
//    public String getLastName() {
//        return this.lastName;
//    }
//
//    public String getPhoneNumber() {
//        return this.phoneNumber;
//    }
//
//
//    public static class CustomerInfoBuilder {
//
//        private String id;
//        private String email;
//        private String firstName;
//        private String lastName;
//        private String phoneNumber;
//
//        public CustomerInfoBuilder(String email) {
//            if (email == null) {
//                throw new IllegalArgumentException("Email address cannot be empty");
//            }
//            this.email = email;
//        }
//
//        public CustomerInfoBuilder id(String id) {
//            this.id = id;
//            return this;
//        }
//
//        public CustomerInfoBuilder email(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public CustomerInfoBuilder firstName(String firstName) {
//            this.firstName = firstName;
//            return this;
//        }
//
//        public CustomerInfoBuilder lastName(String lastName) {
//            this.lastName = lastName;
//            return this;
//        }
//
//        public CustomerInfoBuilder phoneNumber(String phoneNumber) {
//            this.phoneNumber = phoneNumber;
//            return this;
//        }
//
//        public CustomerInfo build() {
//            return new CustomerInfo(this);
//        }
//
//    }
//}