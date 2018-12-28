package com.mindtree.hotel.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hotel.entity.Booking;
import com.mindtree.hotel.repository.BookingRepository;
import com.mindtree.hotel.service.BookingService;
@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	//save booking
	@Override
	public String addBooking(Booking booking) {
		bookingRepository.save(booking);
		return "Success";
	}
	
	
	//fetch all booking
	@Override
	public List<Booking> listAllBooking() {
		List<Booking> l = new ArrayList<Booking>();
		bookingRepository.findAll().forEach(e -> {l.add(e);});
		return l;
	}
	
	
	//fetch by id
	@Override
	public Optional<Booking> getByID(int bookingId) {
		return bookingRepository.findById(bookingId);
	}

}
