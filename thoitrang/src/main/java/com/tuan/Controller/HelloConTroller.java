package com.tuan.Controller;

/*import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tuan.Entity.NhanVien;*/
import org.springframework.stereotype.Controller;
@Controller
public class HelloConTroller {

//	@RequestMapping("/")
	/*public String TrangChu(ModelMap modelMap) {
		
		//String username = "tuan";
	//	String password = "1234567";
		
		NhanVien nv = new NhanVien();
		nv.setTenNV("Tuấn");
		nv.setTuoiNV(23);
		nv.setDiaChiNV("Hà Nội");
		//modelMap.addAttribute("nhanvien", nv);
		NhanVien nv1 = new NhanVien();
		nv1.setTenNV("Tuấn123");
		nv1.setTuoiNV(23);
		nv1.setDiaChiNV("Hà Nội1");
		//modelMap.addAttribute("nhanvien", nv);
//		modelMap.addAttribute("username", username);
//		modelMap.addAttribute("password", password);
		List<NhanVien> list = new ArrayList<NhanVien>();
		list.add(nv);
		list.add(nv1);
		modelMap.addAttribute("listnhanvien", list);
		modelMap.addAttribute("ten", "tuan");
		modelMap.addAttribute("tuoi", 23);
		return "TrangChu";
		
	}*/
	/* sử dụng modelandview
	 * public ModelAndView TrangChu() {
		ModelAndView andView = new ModelAndView();
		andView.setViewName("TrangChu");
		String username = "tuan";
		String password = "1234567";
		
		andView.addObject("tendangnhap", username);
		andView.addObject("matkhau", password);
		return andView;
		
	}*/
	/*public String index() {
		return "index";
	}
*/
	//@GetMapping
	//@RequestMapping(path = "/chitiet/{id}", method = RequestMethod.GET)
	// thêm required xem biến này mặc định có hay là k (default = true)
	// nên dùng pathvariable thay cho requestparam
	//matrixvariable giống nhứ requestparam nhưng đi cùng với pathvariable
	//cần khai báo mvc:anotation diven bên spring bean
	/*public String chitiet(@PathVariable int id ,@MatrixVariable String check,@MatrixVariable String tenSp,ModelMap map) {
		map.addAttribute("check", check);
		map.addAttribute("id", id);
		map.addAttribute("tenSp", tenSp);
		return "chitiet";
	}
	@RequestMapping(path="/chitiet",method = RequestMethod.POST)
	public String postChiTiet(@RequestParam String hoten,@RequestParam String diaChi, ModelMap modelMap) {
		modelMap.addAttribute("name", hoten);
		modelMap.addAttribute("diachi", diaChi);
		return "chitiet";
	}*/
}

