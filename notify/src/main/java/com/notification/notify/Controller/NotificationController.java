package com.notification.notify.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notification.notify.Service.NotificationService;
import com.notification.notify.dto.Ticket;
import com.notification.notify.entity.Notification;


@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/campaign/{campaignId}")
    public ResponseEntity<String> notifyCampaignUpdate(@PathVariable Long campaignId, @RequestBody Notification notification) {
        notificationService.notifyCampaignUpdate(campaignId,notification.getRecipient());
        return ResponseEntity.ok("Notification sent successfully");
        
    }

    @PostMapping("/ticket/{ticketId}")
    public ResponseEntity<String> ticketResolve(@PathVariable Long ticketId) {
        notificationService.notifyTicket(ticketId);
        return null;
    }
    

}
