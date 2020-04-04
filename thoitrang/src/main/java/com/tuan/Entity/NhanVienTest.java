package com.tuan.Entity;

/*import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;*/

//@Entity(name="NhanVien")
public class NhanVienTest {
	/*@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)*/
	/*khai báo id là đại diện cho khóa chính bảng NhanVien
	 * cách biến đặt giống trong MySQL
	 */
	
/*	int idNhanVien;
	String tenNhanVien;
	int tuoi;*/
	
	//nêu quan hệ 1 nhân viên có nhiều sản phẩm
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idNhanVien") //khóa liên kết
	Set<SanPham> phams;
	public NhanVien() {
		
	}
	
	public Set<SanPham> getPhams() {
		return phams;
	}

	public void setPhams(Set<SanPham> phams) {
		this.phams = phams;
	}

	public NhanVien(int idNhanVien, String tenNhanVien, int tuoi) {
		super();
		this.idNhanVien = idNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
	}
	public NhanVien( String tenNhanVien, int tuoi) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
	}
	public int getIdNhanVien() {
		return idNhanVien;
	}
	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}*/
	
	/*
	public String tenNV;
	public int tuoiNV;
	public String diaChiNV;
	
	NhanVien nhanvien;
	public NhanVien(String tenNV, int tuoiNV, String diaChiNV, NhanVien nhanvien) {
		super();
		this.tenNV = tenNV;
		this.tuoiNV = tuoiNV;
		this.diaChiNV = diaChiNV;
		this.nhanvien = nhanvien;
	}
	public NhanVien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
	public NhanVien(String tenNV, int tuoiNV, String diaChiNV) {
		super();
		this.tenNV = tenNV;
		this.tuoiNV = tuoiNV;
		this.diaChiNV = diaChiNV;
	}
	public NhanVien() {
	
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public int getTuoiNV() {
		return tuoiNV;
	}
	public void setTuoiNV(int tuoiNV) {
		this.tuoiNV = tuoiNV;
	}
	public String getDiaChiNV() {
		return diaChiNV;
	}
	public void setDiaChiNV(String diaChiNV) {
		this.diaChiNV = diaChiNV;
	}
	*/
}
