package com.notification.notify.dto;

public class Customer {
    private Long customerId;
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Customer() {
    }
    public Customer(Long customerId, String email) {
        this.customerId = customerId;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", email=" + email + "]";
    }
}
