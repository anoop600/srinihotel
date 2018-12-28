package com.mindtree.hotel.service;

import java.util.List;
import java.util.Optional;

import com.mindtree.hotel.entity.Booking;


public interface BookingService {
	public String addBooking(Booking booking);
	public List<Booking> listAllBooking();
	public Optional<Booking> getByID(int bookingId);

}
