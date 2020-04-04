package com.tuan.Entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class NhanVien {
	 String tenNV;
     String add;
     int age;
       GiamDoc doc;
     //duyệt list với bean
     List<GiamDoc> list;
     //dùng map với bean
     Map<String, Object> map;
     Properties properties;
    public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<GiamDoc> getList() {
		return list ;
	}

	public void setList(List<GiamDoc> list) {
		this.list = list;
	}

	public GiamDoc getDoc() {
		return doc;
	}

	public void setDoc(GiamDoc doc) {
		this.doc = doc;
	}

	public NhanVien() {
    	
    }
    
    public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	/*
	 * sử dụng bean factory
	 */
	/*public static  NhanVien creatNhanVien() {
		NhanVien nv = new NhanVien();
		nv.setTenNV("Tuấn T");
		return nv;
	}*/
	
	
	public NhanVien(String tenNV, String add, int age) {
		
		this.tenNV = tenNV;
		this.add = add;
		this.age = age;
	}
	/*public void Start() {
		System.out.println("Hello - START SPRING");
	}
	public void Destroy() {
		System.out.println("Finished SPRING");
	}*/
	public List<String> getThongBao() {
		//tenNV được dẫn xuất từ file IoC.xml 
		// Container IoC
    	System.out.println("hello đây là thông báo từ class nhân viên :"
		+"tên nhân viên là: "+ getTenNV() +"có tuổi là " + getAge() +" địa chỉ : " +getAdd());
		return null;
    }
	
	
}

