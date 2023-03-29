package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.dtocls;
@WebServlet("/book")
public class controlcls extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String s1=new String("customername");
		String s2=new String("moviename");
		String s3=new String("seatno");
		 int s= Integer.parseInt(s3);
		String s4=new String("ticketprice");
		 double s41=Double.parseDouble(s4);
		String s5=new String("nooftickets");
		 int s51=Integer.parseInt(s5);
		 
		 
		if(s51==2)
		 {
			double a=s41*2;
		 }
		else
		{
			System.out.println("data is not inserted");
		}
		
		dtocls d=new dtocls();
		d.setCustomername(s1);
		d.setMoviename(s2);
		d.setSeat_no(s);
		d.setTicket_price(s41);
		d.setNo_of_tickets(s51);
		
	}     
}
