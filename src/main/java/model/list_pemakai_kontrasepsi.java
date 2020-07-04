package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="list_pemakai_kontrasepsi")
public class list_pemakai_kontrasepsi {
 
	private int id_list;
	private int id_propinsi;
	private int id_kontrasepsi;
	private int jumlah_pemakai;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_list() {
		return id_list;
	}
	public void setId_list(int id_list) {
		this.id_list = id_list;
	}
	public int getId_propinsi() {
		return id_propinsi;
	}
	public void setId_propinsi(int id_propinsi) {
		this.id_propinsi = id_propinsi;
	}
	public int getId_kontrasepsi() {
		return id_kontrasepsi;
	}
	public void setId_kontrasepsi(int id_kontrasepsi) {
		this.id_kontrasepsi = id_kontrasepsi;
	}
	public int getJumlah_pemakai() {
		return jumlah_pemakai;
	}
	public void setJumlah_pemakai(int jumlah_pemakai) {
		this.jumlah_pemakai = jumlah_pemakai;
	}
	
	public list_pemakai_kontrasepsi(int id_list, int id_propinsi, int id_kontrasepsi, int jumlah_pemakai) {
		super();
		this.id_list = id_list;
		this.id_propinsi = id_propinsi;
		this.id_kontrasepsi = id_kontrasepsi;
		this.jumlah_pemakai = jumlah_pemakai;
	}
	
	
	
}
