package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class dtocls {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int bookingid;
 private String customername;
 private String moviename;
 private int seat_no;
 private double ticket_price;
 private int no_of_tickets;
public int getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public int getSeat_no() {
	return seat_no;
}
public void setSeat_no(int seat_no) {
	this.seat_no = seat_no;
}
public double getTicket_price() {
	return ticket_price;
}
public void setTicket_price(double ticket_price) {
	this.ticket_price = ticket_price;
}
public int getNo_of_tickets() {
	return no_of_tickets;
}
public void setNo_of_tickets(int no_of_tickets) {
	this.no_of_tickets = no_of_tickets;
}

 

 
 
}
