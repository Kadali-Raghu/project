package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productcategorys")
public class productcategorys {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pcid")
	private int pcid;
	@Column(name="pcname")
	private String pcname;
	
	
	@OneToMany(mappedBy = "pc") 
	private Set<items>items;
	public productcategorys() {
	
	}
	public productcategorys(int pcid, String pcname) {
		super();
		this.pcid = pcid;
		this.pcname = pcname;
	}
	public int getPcid() {
		return pcid;
	}
	public void setPcid(int pcid) {
		this.pcid = pcid;
	}
	public String getPcname() {
		return pcname;
	}
	public void setPcname(String pcname) {
		this.pcname = pcname;
	}
	@Override
	public String toString() {
		return "productcategorys [pcid=" + pcid + ", pcname=" + pcname + "]";
	}
	

	
	
}
