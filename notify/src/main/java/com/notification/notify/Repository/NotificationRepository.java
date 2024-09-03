package com.notification.notify.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.notification.notify.entity.Notification;

//import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    // Custom query methods (if needed)

    //List<Notification> findByCustomerId(Long customerId);
}