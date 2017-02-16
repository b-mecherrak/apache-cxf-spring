package com.ocp.entities;

import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@XmlRootElement(name = "Produit")
public class Produit {

	private String id;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date date;
	@NotNull
	private String libelle;
	

	public Produit() {
	
	}
	
	public Produit(String id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
