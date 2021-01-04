package com.spring.gogidang.booking;

public class BookingVO {
	private String booking_num;
	private String u_id;
	private String s_num;
	private String time;
	private int head_count;
	private int table_charge;
	private int pay_price;
	private String pay_code;
	private int booking_state;
	
	public String getBooking_num() {
		return booking_num;
	}
	public void setBooking_num(String booking_num) {
		this.booking_num = booking_num;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getS_num() {
		return s_num;
	}
	public void setS_num(String s_num) {
		this.s_num = s_num;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getHead_count() {
		return head_count;
	}
	public void setHead_count(int head_count) {
		this.head_count = head_count;
	}
	public int getTable_charge() {
		return table_charge;
	}
	public void setTable_charge(int table_charge) {
		this.table_charge = table_charge;
	}
	public int getPay_price() {
		return pay_price;
	}
	public void setPay_price(int pay_price) {
		this.pay_price = pay_price;
	}
	public String getPay_code() {
		return pay_code;
	}
	public void setPay_code(String pay_code) {
		this.pay_code = pay_code;
	}
	public int getBooking_state() {
		return booking_state;
	}
	public void setBooking_state(int booking_state) {
		this.booking_state = booking_state;
	}
	
	
}
