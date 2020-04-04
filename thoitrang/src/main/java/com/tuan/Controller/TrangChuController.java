package com.tuan.Controller;


import java.util.List;

import javax.servlet.http.HttpSession;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tuan.Entity.DanhMucSanPham;
import com.tuan.Entity.GopY;
import com.tuan.Entity.SanPham;
import com.tuan.Service.DanhMucService;
import com.tuan.Service.GopYService;
import com.tuan.Service.SanPhamService;


@Controller
@RequestMapping("/")
public class TrangChuController {
	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucService danhmucService;
		
	@Autowired
	GopYService gopyService;
	@GetMapping	
	@Transactional
	// gọi transacstion để thay cho tên định danh từ bean IoC
	// phải khai báo tx: anotation 
	//@SessionAttribute("email") String email,ModelMap modelMap,HttpSession httpSession
	public String Default(ModelMap modelMap,HttpSession httpSession) {
		if(httpSession.getAttribute("email") != null) {
			String ten = (String) httpSession.getAttribute("email");
			String FirstChar = ten.toString();
			modelMap.addAttribute("FirstChar",FirstChar);
		}
		List<SanPham> listSanPhams = sanPhamService.layDanhSachSanPhamLimit(-1);
		modelMap.addAttribute("listSanPhams", listSanPhams);
		
		List<DanhMucSanPham> danhMucSanPhams = danhmucService.layDanhMuc();
		modelMap.addAttribute("danhmuc", danhMucSanPhams);
		/*for(SanPham sp : sanPhams) {
			System.out.println("sản phẩm :" +sp.getTensanpham() );
		}*/
		//System.out.println(httpSession.getAttribute("email"));
		/*ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		Session session = sessionFactory.getCurrentSession();
		String FirstChar = email.substring(0, 1);
		modelMap.addAttribute("FirstChar", FirstChar);*/
		return "TrangChu";
	}
	@PostMapping
	public String GopY(ModelMap modelMap,@PathVariable String email,@PathVariable String noidung) {
		GopY gopY = new GopY();
		gopY.setEmail(email);
		gopY.setNoidung(noidung);
		boolean ktra = gopyService.ThemGopY(gopY);
		if(ktra) {
			modelMap.addAttribute("kiemtragopy", "Thêm thành công");
		}else {
			modelMap.addAttribute("kiemtragopy", "Thêm thất bại");
		}
		return "TrangChu"; 
	}
	
	@GetMapping("/lienhe")
	public String LienHe() {
		
		return "lienhe";
	}
	@GetMapping("/dichvu")
	public String DichVu() {
		
		return "dichvu";
	}
	/*@GetMapping("/giohang")
	public String GioHang() {
		
		return "giohang";
	}*/
	
	@Autowired
	SanPhamService sanphamService;
	@GetMapping("/{id}")
	public String ChiTiet(@RequestParam int id,ModelMap modelMap) {
		SanPham sanPhams =  sanphamService.layDanhSachChiTietSanPhamTheoMa(id);
		modelMap.addAttribute("sanPhams", sanPhams);
		return "chitiet";
	}
	
	//Lấy sản phẩm
	
	
	
	
	
	//NhanVien1 nv1 = (NhanVien1)context.getBean("dataSource");
	/*Session session = sessionFactory.getCurrentSession();
	String sql = "from NhanVien";
	List<NhanVien> nhanVien = session.createQuery(sql).getResultList();
	
	for(NhanVien nv : nhanVien) {
		System.out.println("ten nhan vien : " + nv.getTenNhanVien());
		
	}
	SanPham sanPham = new SanPham();
	sanPham.setTenSanPham("Banh z");
	sanPham.setGiaTien("100.000đ");
	
	SanPham sanPham1 = new SanPham();
	sanPham1.setTenSanPham("Banh 2");
	sanPham1.setGiaTien("50.000đ");
	
	SanPham sanPham2 = new SanPham();
	sanPham2.setTenSanPham("Banh 1");
	sanPham2.setGiaTien("50.000đ");
	
	Set<SanPham> phams12 = new HashSet<SanPham>();
	phams12.add(sanPham);
	phams12.add(sanPham1);
	phams12.add(sanPham2);
	
	NhanVien nhanVien2 = new NhanVien();
	nhanVien2.setTenNhanVien("JohnCena");
	nhanVien2.setTuoi(39);
	
	nhanVien2.setPhams(phams12);
	session.save(nhanVien2);*/
	
	//Update Hibernate
/*	NhanVien nhanVien2 = new NhanVien("tuan",123);
	nhanVien2.setIdNhanVien(10);
	nhanVien2.setTuoi(23);
	session.update(nhanVien2);*/
	// cách update 2
/*	NhanVien tuan =(NhanVien) session.createQuery("from NhanVien Where idNhanVien = 1").uniqueResult();
	//NhanVien tuan =session.get(NhanVien.class,21);
	tuan.setTenNhanVien("dang manh tuan");

	session.update(tuan);*/
	/*
	 * connect database
	DatabaseThoiTrang databaseThoiTrang = (DatabaseThoiTrang) context.getBean("databasethoitrang");
	
	databaseThoiTrang.getListNhanVien();
	*/
	

/*//Thêm với Hibernate
@PostMapping
@Transactional
public String ThemNhanVien(@RequestParam String tenNhanVien,@RequestParam int tuoi) {
	Session session = sessionFactory.getCurrentSession();
	NhanVien nhanVien = new NhanVien(tenNhanVien,tuoi);
	session.save(nhanVien);
	return "TrangChu";
}*/



/*@GetMapping
public String Default() {
	return "chitiet";S
}
@PostMapping
//dùng modelattribute thay cho requestparam
public String UpdateThongTin(@ModelAttribute NhanVien nv , ModelMap modelMap) {
	modelMap.addAttribute("nv", nv);
	
	return "chitiet";
}*/

}
		


