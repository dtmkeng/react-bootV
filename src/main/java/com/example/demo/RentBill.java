package com.example.demo;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

@Data
@Entity
public class RentBill {

	private @Id
	@GeneratedValue
	Long billId;
	@ManyToOne
	private MusicalInstrument musicType;
    private String member;
	private String rentdate;
	private String returndate;
	private String price;

	private RentBill() {}

	public RentBill(MusicalInstrument musicType, String member,String rentdate, String returndate,String price) {
		this.member = member;
		this.musicType = musicType;
		this.rentdate = rentdate;
		this.returndate = returndate;
		this.price = price;
	}
}