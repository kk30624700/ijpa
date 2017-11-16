package com.m24.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m24.demo.entity.Appointment;
import com.m24.demo.repository.AppointmentRepository;
import com.m24.demo.repository.BookRepository;
import com.m24.demo.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;
	@Autowired
	BookRepository bookRepository;
	
	@Override
	@Cacheable("appointment")
	@Transactional
	public Appointment findByStudentId(long studnetId) {
		return appointmentRepository.findByStudentId(studnetId);
	}

	@Override
	@CachePut(value="appointment", key="#result.appointmentId")
	@Transactional
	public Appointment save(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

}
