package com.mindtree.hotel;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mindtree.hotel.entity.Booking;
import com.mindtree.hotel.service.BookingService;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ServiceBookingJunit {
	
	static Booking booking=null;
	
	@Autowired
    private BookingService bookingService;
	
	
	@BeforeClass
	public static void beforeclass()
	{
		booking = new Booking();
		booking.setBookingId(1);
		booking.setCheckIn("25/6/2018");
		booking.setCheckOut("28/6/2018");
		booking.setCustomerName("srini");
		booking.setHotelName("saiDham");
		booking.setNoOfRooms(3);
		booking.setRoomType("Deluxe");
		
	}
	
	//Checking Not null
	@Test
    public  void test2() {
		Assert.assertNotNull(booking);
		Assert.assertNotNull(booking.getCheckIn());
		Assert.assertNotNull(booking.getCheckOut());
		Assert.assertNotNull(booking.getCustomerName());
		Assert.assertNotNull(booking.getHotelName());
    }
	
	//Checking adding a employee or not
	@Test
	public void addProject()
	{
		assertEquals("Success",bookingService.addBooking(booking));
	}
}
