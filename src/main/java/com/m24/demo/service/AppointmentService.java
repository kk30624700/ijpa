package com.m24.demo.service;

import com.m24.demo.entity.Appointment;

public interface AppointmentService {
	
	Appointment findByStudentId(long studnetId);

	Appointment save(Appointment appointment);
	
}
