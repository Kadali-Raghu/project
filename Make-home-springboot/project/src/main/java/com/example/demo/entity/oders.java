package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart_orders")
public class oders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="o_id")
	private int o_id;
	@Column(name="id")
	private int id;
	@Column(name="price")
	private int price;
	
	@Column(name="name")
	private String name;
	@Column(name="u_id")
	private int u_id;
	@Column(name="image")
	private String image;
	@Column(name="qty")
	private Integer qty;
	@OneToOne(targetEntity=items.class)
	@JoinColumn(name="id",insertable = false,updatable = false)
	private items Items;
	@OneToOne(targetEntity=user.class)
	@JoinColumn(name="u_id",insertable = false,updatable = false)
	private user user;
	public oders() {
		super();
	}
//	public oders(int o_id, int id, int price, String name, int u_id, String image, items items, int qty,
//			com.example.demo.entity.user user) {
//		super();
//		this.o_id = o_id;
//		this.id = id;
//		this.price = price;
//		this.name = name;
//		this.u_id = u_id;
//		this.image = image;
//		this.qty = qty;
//		Items = items;
//		this.user = user;
//	}
//	public int getO_id() {
//		return o_id;
//	}
//	public void setO_id(int o_id) {
//		this.o_id = o_id;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getU_id() {
//		return u_id;
//	}
//	public void setU_id(int u_id) {
//		this.u_id = u_id;
//	}
//	public String getImage() {
//		return image;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
//	public int getQty() {
//		return qty;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	public items getItems() {
//		return Items;
//	}
//	public void setItems(items items) {
//		Items = items;
//	}
//	public user getUser() {
//		return user;
//	}
//	public void setUser(user user) {
//		this.user = user;
//	}
//	@Override
//	public String toString() {
//		return "oders [o_id=" + o_id + ", id=" + id + ", price=" + price + ", name=" + name + ", u_id=" + u_id
//				+ ",qty=" + qty +", image=" + image + ", Items=" + Items + ", user=" + user + "]";
//	}
//	
	public oders(int o_id, int id, int price, String name, int u_id, String image, Integer qty, items items,
			user user) {
		super();
		this.o_id = o_id;
		this.id = id;
		this.price = price;
		this.name = name;
		this.u_id = u_id;
		this.image = image;
		this.qty = qty;
		Items = items;
		this.user = user;
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public items getItems() {
		return Items;
	}
	public void setItems(items items) {
		Items = items;
	}
	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "oders [o_id=" + o_id + ", id=" + id + ", price=" + price + ", name=" + name + ", u_id=" + u_id
				+ ", image=" + image + ", qty=" + qty + ", Items=" + Items + ", user=" + user + "]";
	}
	

}
