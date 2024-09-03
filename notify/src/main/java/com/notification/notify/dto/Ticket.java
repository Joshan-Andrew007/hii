package com.notification.notify.dto;


public class Ticket {
    private Long ticketId;
    private Long customerId;
    private String status;
    
    @Override
    public String toString() {
        return "Ticket [ticketId=" + ticketId + ", customerId=" + customerId + ", status=" + status + "]";
    }
    public Ticket(Long ticketId, Long customerId, String status) {
        this.ticketId = ticketId;
        this.customerId = customerId;
        this.status = status;
    }
    public Ticket() {
    }
    public Long getTicketId() {
        return ticketId;
    }
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
