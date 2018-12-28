package com.mindtree.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.hotel.entity.Booking;
public interface BookingRepository extends CrudRepository<Booking,Integer> {


}
