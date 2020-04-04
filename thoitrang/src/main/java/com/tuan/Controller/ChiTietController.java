package com.tuan.Controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tuan.Entity.DanhMucSanPham;
import com.tuan.Entity.GallerySanPham;
import com.tuan.Entity.GioHang;
import com.tuan.Entity.SanPham;
import com.tuan.Service.DanhMucService;
import com.tuan.Service.GallerySanPhamService;
import com.tuan.Service.SanPhamService;

@Controller
@RequestMapping("/chitiet")
@SessionAttributes("giohang")
public class ChiTietController {
@Autowired	
SanPhamService sanphamService;

@Autowired
DanhMucService danhmucService;

@Autowired
GallerySanPhamService gallerysanphamService;


	@GetMapping("/{masanpham}")// xoá bỏ mã sản phẩm khỏi miền
	public String Default(@PathVariable int masanpham,ModelMap modelMap,HttpSession httpSession) {
			SanPham sanPhams =  sanphamService.layDanhSachChiTietSanPhamTheoMa(masanpham);
			modelMap.addAttribute("sanPhams", sanPhams);
			
		
			
			if(null != httpSession.getAttribute("giohang")) {
				List<GioHang> gioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
				modelMap.addAttribute("soluongsanphamgiohang",gioHangs.size());
			}
			List<GallerySanPham> gallerySanPhams =gallerysanphamService.LayDanhSachGallerySanPham();
			modelMap.addAttribute("gallerySanPhams", gallerySanPhams);
			
			List<DanhMucSanPham> danhMucSanPhams = danhmucService.layDanhMuc();
			modelMap.addAttribute("danhmucs", danhMucSanPhams);
		return "chitiet";
		
		}
	
	@GetMapping
	public String Default(ModelMap modelMap,HttpSession httpSession) {
		List<DanhMucSanPham> danhMucSanPhams = danhmucService.layDanhMuc();
		modelMap.addAttribute("danhmucs", danhMucSanPhams);
		
		return "sanpham";
	}

	
	@GetMapping("/thoitrang")
	public String TrangChu() {
		return "trangchu";
	}
	@GetMapping("/chitiet")
	public String ChiTiet() {
		return "chitiet";
	}
}
/*	@GetMapping("/dichvu")
	public String DichVu() {
		
		return "dichvu";
	}
	
	@GetMapping("/lienhe")
	public String LienHe() {
		
		return "lienhe";
	}
	
	
	@GetMapping("/giohang")
	public String GioHang() {
		return "giohang";
	}
	
}*/
