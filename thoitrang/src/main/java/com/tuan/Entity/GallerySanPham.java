package com.tuan.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity(name="GALLERYSANPHAM")
public class GallerySanPham {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	int magallerysanpham;
	String gallery;
	
	/*@ManyToOne(cascade= CascadeType.ALL)// 1 danh mục có nhiều sản phẩm
	@JoinColumn(name="magallerysanpham")
	SanPham danhsachsanphamgallery;

	
	

	public SanPham getDanhsachsanphamgallery() {
		return danhsachsanphamgallery;
	}
	public void setDanhsachsanphamgallery(SanPham danhsachsanphamgallery) {
		this.danhsachsanphamgallery = danhsachsanphamgallery;
	}*/
	public int getMagallerysanpham() {
		return magallerysanpham;
	}
	public void setMagallerysanpham(int magallerysanpham) {
		this.magallerysanpham = magallerysanpham;
	}
	public String getGallery() {
		return gallery;
	}
	public void setGallery(String gallery) {
		this.gallery = gallery;
	}
	
	
}
