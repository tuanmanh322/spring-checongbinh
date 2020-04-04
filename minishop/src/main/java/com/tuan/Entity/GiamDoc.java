package com.tuan.Entity;

public class GiamDoc extends NhanVien{
   String chucvu;

public String getChucvu() {
	return chucvu;
}

public void setChucvu(String chucvu) {
	this.chucvu = chucvu;
}

public GiamDoc(String chucvu,String tenNV,String add,int age) {
	super(tenNV,add, age);
	this.chucvu = chucvu;
}
  public void TT() {
	 System.out.println("tên là : " + this.getTenNV() +" địa chỉ là : " +this.getAdd() +" tuổi là :" + this.getAge());
  }
}