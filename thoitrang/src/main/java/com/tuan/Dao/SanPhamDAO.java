package com.tuan.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tuan.Entity.ChiTietHoaDon;
import com.tuan.Entity.ChiTietHoaDonId;
import com.tuan.Entity.ChiTietSanPham;
import com.tuan.Entity.GallerySanPham;
import com.tuan.Entity.SanPham;
import com.tuan.daoimpl.SanPhamimpl;

@Repository
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)//lấy cả class
public class SanPhamDAO implements SanPhamimpl{
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional // vì đang truy vấn cơ sở dữ liệu
	public List<SanPham> layDanhSachSanPhamLimit(int spbatdau) {
		Session session = sessionFactory.getCurrentSession();
		// lấy ra danh sách sản phẩm từ id 0->20
		String query = "from SANPHAM";
		List<SanPham> listsanPhams = new ArrayList<SanPham>();
		if(spbatdau<0 ) {
			listsanPhams = (List<SanPham>)session.createQuery(query).getResultList();	
		}else {
			// nếu số page là 1 thì load từ 0-5
			// page là 2 thì load 2-1*5
			// page là 3 thì load 3-1*5
			listsanPhams = (List<SanPham>)session.createQuery(query).setFirstResult(spbatdau).setMaxResults(5).getResultList();

			
		}
		return listsanPhams;
		
	}
	
	@Transactional
	public SanPham layDanhSachChiTietSanPhamTheoMa(int masanpham){
		Session session = sessionFactory.getCurrentSession(); 
		/*
		 *  lấy ra danh sách sản phẩm theo mã với 3 bảng
		 *  do đã khai báo các 
		 */
		
		String query = "from SANPHAM sp where sp.masanpham =" + masanpham;
		SanPham sanPhams =  (SanPham) session.createQuery(query).getSingleResult();
		
		return (SanPham) sanPhams;
	}
	@Transactional
	public List<SanPham> laySanPhamTheoMaDanhMuc(int madanhmuc) {
		Session session = sessionFactory.getCurrentSession(); 
		String query = "from SANPHAM sp where sp.danhmucsanpham.madanhmuc=" + madanhmuc;
		List<SanPham> sanPhams =  (List<SanPham>) session.createQuery(query).getResultList();
		
		return sanPhams;
	}
	
	@Transactional
	public boolean XoaSanPhamTheoMaSanPham(int masanpham) {
		Session session = sessionFactory.getCurrentSession(); 
		SanPham sanPham = session.get(SanPham.class, masanpham);
		
		//tạo list
		Set<ChiTietSanPham> chiTietSanPhams =  sanPham.getChitietsanpham();
		
		
		for (ChiTietSanPham chiTietSanPham : chiTietSanPhams) {
			/*ChiTietHoaDonId chiTietHoaDonId = new ChiTietHoaDonId();
			chiTietHoaDonId.setMachitietsanpham(sanPham.getMasanpham());
			ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
			chiTietHoaDon.setChiTietHoaDonId(chiTietHoaDonId);*/
			
			session.createQuery("delete CHITIETHOADON WHERE machitietsanpham=" + chiTietSanPham.getMachitietsanpham()).executeUpdate();
		
		}
		session.createQuery("delete CHITIETSANPNHAM WHERE masanpham=" + masanpham).executeUpdate();
		
		session.createQuery("delete SANPHAM WHERE masanpham=" + masanpham).executeUpdate();
		session.delete(sanPham);
		return false;
	}
   @Transactional
	public List<SanPham> LayGallerySanPham() {
		Session session = sessionFactory.getCurrentSession(); 
		String query ="from SANPHAM sp where sp.gallerysanpham.madanhmuc=";
		List<SanPham>	gallerySanPhams =	session.createQuery(query).getResultList();
		return gallerySanPhams;
	}

	/*public List<GallerySanPham> LayGallerySanPham() {
		Session session = sessionFactory.getCurrentSession(); 
		String query ="from GALLERYSANPHAM";
		List<GallerySanPham>	gallerySanPhams =	session.createQuery(query).getResultList();
		
		return gallerySanPhams;
	}*/

}
