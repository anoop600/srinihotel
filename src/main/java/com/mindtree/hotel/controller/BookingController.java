package com.mindtree.hotel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hotel.entity.Booking;
import com.mindtree.hotel.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	
	//adding booking mapping
	@RequestMapping(method=RequestMethod.POST,value="/booking")
	public void addEmployee(@RequestBody Booking booking)
	{
		bookingService.addBooking(booking);
	}
	
	//fetch all booking
	@RequestMapping("/bookings")
	public List<Booking> getAllBookings() {
		return bookingService.listAllBooking();
	}
	
	//fetch by id
	@RequestMapping("/booking/{bookingId}")
	public Optional<Booking> getBooking(@PathVariable("bookingId") int bookingId)
	{
		return bookingService.getByID(bookingId);
	}
	
}
