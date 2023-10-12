package lesson4.seminar4.message;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {

    @Test
    void testSendNotification() {
        MessageService messageService = mock(MessageService.class);

        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("Hello world", "user");

        verify(messageService, times(1)).sendMessage("Hello world", "user");
    }
}