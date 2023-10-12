package lesson4.seminar4.hotel;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class BookingServiceTest {

    @Test
    void testIsAvailableRoom() {
        HotelService hotelService = mock(HotelService.class);

        when(hotelService.isRoomAvailable(anyInt())).thenReturn(true);

        BookingService bookingService = new BookingService(hotelService);

        assertTrue(bookingService.bookRoom(404));
    }

}