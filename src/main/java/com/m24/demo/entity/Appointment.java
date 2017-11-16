package com.m24.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointment implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long appointmentId;// 图书ID

	@Temporal(TemporalType.TIMESTAMP)
    private Date appointTime;// 预约时间
	
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="book_id")
    private Book book;// 图书实体
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="student_id")
    private Student student;

    public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Timestamp appointTime) {
        this.appointTime = appointTime;
    }
    
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

	public String toString() {
        return /*"Appointment [bookId=" + bookId + "studentId=" + studentId + */"appointTime=" + appointTime + "]";
    }
}
