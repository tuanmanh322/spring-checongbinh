package com.tuan.Controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.jasper.tagplugins.jstl.core.Url;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import com.tuan.Entity.GiamDoc;
import com.tuan.Entity.NhanVien;
import com.tuan.Entity.TestIoC;

@Controller
public class HomeController {
      @RequestMapping("/")
      /*
       * bỏ responbody thì sẽ gọi được file JSP
       */
     // @ResponseBody
      public String HomePage(ModelMap model)  {
/*   1-11 thì open 	 
 * ApplicationContext gọi các Container
 *  ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
 *  */
    	  
    	  //NhanVien nv = (NhanVien) context.getBean("NhanVien");
    	  
    	//----------------
    	  //01 dùng properties cho connect database
/*    	String jdbc=  nv.getProperties().getProperty("jdbc");
    	  System.out.println(jdbc);*/
    	  
    	  /*
    	   *4 sử dụng bean Connect Ioc
    	   *  GiamDoc gd = (GiamDoc) context.getBean("GiamDoc");
    	   *  TestIoC ttc = (TestIoC) context.getBean("TestIoC");
    	 nv.getThongBao();
    	  ttc.getName();
    	   */
    	  //-----------------------
    	  /*
    	   *8 duyệt map không cần biết map có những key nào
    	   *  for(Entry<String, Object> entry : nv.getMap().entrySet()) {
    		  System.out.println(entry.getKey() + "--" +entry.getValue());
    	  }
    	   */
    	 
    	  //-----------------------
    	  
    	  /*7
    	   * 
    	   * duyệt từng key theo map
    	   * GiamDoc gd =(GiamDoc)nv.getMap().get("key2");
    	  System.out.println(gd.getTenNV());
    	   */
    	  //--------------------------------------
    	  
    	 /*7 duyệt list với bean có ref
    	  * for(GiamDoc result : nv.getList()) {
    		  System.out.println(result.getTenNV());
    		  System.out.println(result.getChucvu());
    		  System.out.println(result.getAge());
    	  }*/
    	  //-------------------------------
    	  
    	/* 5 duyệt List với bean chưa có ref
    	 * for(String result : nv.getList()) {
    		 System.out.println(result);
    	 }*/
    
    	//--------------------------------
    	 
    	  /*
    	   * 3 sử dụng bean contructor
    	   *  nv.getThongBao();
    	   */
    	 
    	//---------------------------------
    	  
    	/* 2 sử dụng bean property
    	 *  nv.getThongBao();
    	  nv.setAge(21);*/

    		//-------------------------
 	
       /*
        * 6 dùng cho duyệt list nhân viên
        * List<String> listNV = nv.getThongBao();
        * listNV.add((String) context.getBean("NhanVien"));
        * gd.toString();
        * --------------------------------
        * 1 : sử dụng bean factory
        * NhanVien nv1 = NhanVien.creatNhanVien();
    	NhanVien nv2 = NhanVien.creatNhanVien();
    	NhanVien nv3 = NhanVien.creatNhanVien();
        */
//    	  respone.sendRedirect("/WEB-INF/views/Home.jsp");
       //9: dùng Inner bean tạo biến class
    	 /*
    	  *  nv.setTenNV("Đặng Mạnh Tuấn");
    	  *  System.out.println(nv.getDoc().getChucvu()+ " ");
    	  */
// 10: AutoWire 
    	  
    /*	  //11: URL load tài liệu lên resource
    	  //CustomeLoader customeLoader = new CustomeLoader();
     	 //customeLoader.setResourceLoader(context);
    	  
    	  CustomeLoader customeLoader = (CustomeLoader) context.getBean("CustomeLoader");
    	  //đọc file từ google.com
    	  Resource resource = customeLoader.getLoader("https://www.google.com/");
    	  try {
    		  URL url = new URL("https://www.google.com/");
    		  HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    		  
    		  connection.connect();
    		  
		} catch (Exception e) {
			e.printStackTrace();
		}
    	  // class path dẫn đến file cần xử lí
    	  //Resource resource = context.getResource("classpath:data.txt");
    	  try {
    		  // đọc file
			InputStream inputStream = resource.getInputStream();
			InputStreamReader isr = new InputStreamReader(inputStream);
			BufferedReader br = new BufferedReader(isr);
			
			String line = "";
			StringBuilder data = new StringBuilder();
			
			//đọc dữ liệu
			while((line = br.readLine()) !=null) {
				 data.append(line +"\n");
				 
			}
			// Mở sau đóng trước
			br.close();
			isr.close();
			inputStream.close();
			System.out.println("giá trị : " + data.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
    	    	  ((ClassPathXmlApplicationContext)context).close();*/
    	  return  "aaaa";
      }
     
}
