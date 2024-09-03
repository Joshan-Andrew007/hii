package com.notification.notify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String recipient;
    private String message;
    private String type; // e.g., "email", "sms"
    /**
     *
     */
    private LocalDateTime sentAt;
    public Notification() {
    }
    public Notification(Long id, String recipient, String message, String type, LocalDateTime sentAt) {
        this.id = id;
        this.recipient = recipient;
        this.message = message;
        this.type = type;
        this.sentAt = sentAt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public LocalDateTime getSentAt() {
        return sentAt;
    }
    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
    @Override
    public String toString() {
        return "Notification [id=" + id + ", recipient=" + recipient + ", message=" + message + ", type=" + type
                + ", sentAt=" + sentAt + "]";
    }

}
