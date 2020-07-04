package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="list_propinsi")
public class list_propinsi {

	
	private int id_propinsi;
	private String nama_propinsi;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_propinsi() {
		return id_propinsi;
	}
	public void setId_propinsi(int id_propinsi) {
		this.id_propinsi = id_propinsi;
	}
	public String getNama_propinsi() {
		return nama_propinsi;
	}
	public void setNama_propinsi(String nama_propinsi) {
		this.nama_propinsi = nama_propinsi;
	}
	
	
	public list_propinsi(int id_propinsi, String nama_propinsi) {
		super();
		this.id_propinsi = id_propinsi;
		this.nama_propinsi = nama_propinsi;
	}

}
