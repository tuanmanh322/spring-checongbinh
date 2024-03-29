package com.tuan.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="SANPHAM")
public class SanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//SET id tự động tăng
	int masanpham;
	@OneToOne(cascade= CascadeType.ALL) // nên đặt ở bảng cha
	@JoinColumn(name="madanhmuc")
	DanhMucSanPham danhmucsanpham;
	
	String tensanpham;
	String giatien;
	String mota;
	String hinhsanpham;
	String gianhcho;
	
	@OneToMany(fetch=FetchType.EAGER,cascade= CascadeType.ALL)//eager cần để load csdl ra giao diện
	@JoinColumn(name="masanpham")
	Set<ChiTietSanPham> chitietsanpham;
	
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="CHITIETKHUYENMAI", joinColumns= {@JoinColumn(name="masanpham",referencedColumnName="masanpham")}, 
	inverseJoinColumns= {@JoinColumn(name="makhuyenmai",referencedColumnName="makhuyenmai")}
	)
	Set<KhuyenMai> danhsachkhuyemai;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="magallerysanpham")
	Set<GallerySanPham> gallerySanPhams;
	
	String gallery;
	
	
	public String getGallery() {
		return gallery;
	}
	public void setGallery(String gallery) {
		this.gallery = gallery;
	}
	public Set<GallerySanPham> getGallerySanPhams() {
		return gallerySanPhams;
	}
	public void setGallerySanPhams(Set<GallerySanPham> gallerySanPhams) {
		this.gallerySanPhams = gallerySanPhams;
	}
	public Set<KhuyenMai> getDanhsachkhuyemai() {
		return danhsachkhuyemai;
	}
	public void setDanhsachkhuyemai(Set<KhuyenMai> danhsachkhuyemai) {
		this.danhsachkhuyemai = danhsachkhuyemai;
	}
	public Set<ChiTietSanPham> getChitietsanpham() {
		return chitietsanpham;
	}
	public void setChitietsanpham(Set<ChiTietSanPham> chitietsanpham) {
		this.chitietsanpham = chitietsanpham;
	}
	public int getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(int masanpham) {
		this.masanpham = masanpham;
	}
	public DanhMucSanPham getDanhmucsanpham() {
		return danhmucsanpham;
	}
	public void setDanhmucsanpham(DanhMucSanPham danhmucsanpham) {
		this.danhmucsanpham = danhmucsanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getGiatien() {
		return giatien;
	}
	public void setGiatien(String giatien) {
		this.giatien = giatien;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getHinhsanpham() {
		return hinhsanpham;
	}
	public void setHinhsanpham(String hinhsanpham) {
		this.hinhsanpham = hinhsanpham;
	}
	public String getGianhcho() {
		return gianhcho;
	}
	public void setGianhcho(String gianhcho) {
		this.gianhcho = gianhcho;
	}
	
}
