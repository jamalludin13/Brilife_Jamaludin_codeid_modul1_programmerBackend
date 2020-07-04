package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="list_kontrasepsi")

public class list_kontrasepsi {

	private int id_kontrasepsi;
	private String nama_kontrasepsi;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_kontrasepsi() {
		return id_kontrasepsi;
	}
	public void setId_kontrasepsi(int id_kontrasepsi) {
		this.id_kontrasepsi = id_kontrasepsi;
	}
	public String getNama_kontrasepsi() {
		return nama_kontrasepsi;
	}
	public void setNama_kontrasepsi(String nama_kontrasepsi) {
		this.nama_kontrasepsi = nama_kontrasepsi;
	}
	
	public list_kontrasepsi(int id_kontrasepsi, String nama_kontrasepsi) {
		super();
		this.id_kontrasepsi = id_kontrasepsi;
		this.nama_kontrasepsi = nama_kontrasepsi;
	}
	
	
	
}