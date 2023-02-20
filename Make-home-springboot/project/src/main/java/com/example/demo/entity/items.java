package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products1")
public class items {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private int price;
	@Column(name="quantity")
	private String quantity;
	@Column(name="image")
	private String image;

	
	@Column(name="dsc")
	private String dsc;
	@Column(name="pcid")
	private int pcid;
	@Column(name="brand")
	private String brand;
	@ManyToOne(targetEntity=productcategorys.class,fetch = FetchType.EAGER) 
	//manyemployees--onedept  (m-o)
	@JoinColumn(name="pcid",insertable = false, updatable = false)
	private productcategorys pc;
	
	
	
	public items() {
		
	}



	public items(int id, String name, int price,String quantity, String image, String dsc, int pcid, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity=quantity;
		this.image = image;
		this.dsc = dsc;
		this.pcid = pcid;
		this.brand = brand;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getQuantity() {
		return quantity;
	}



	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getDsc() {
		return dsc;
	}



	public void setDsc(String dsc) {
		this.dsc = dsc;
	}



	public int getPcid() {
		return pcid;
	}



	public void setPcid(int pcid) {
		this.pcid = pcid;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public productcategorys getPc() {
		return pc;
	}



	public void setPc(productcategorys pc) {
		this.pc = pc;
	}



	@Override
	public String toString() {
		return "items [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", image=" + image
				+ ", dsc=" + dsc + ", pcid=" + pcid + ", brand=" + brand + ", pc=" + pc + "]";
	}



}
