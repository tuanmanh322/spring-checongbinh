package com.tuan.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.tuan.Entity.GallerySanPham;
import com.tuan.daoimpl.GallerySanPhamImpl;

@Repository
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class GallerySanPhamDAO implements GallerySanPhamImpl{
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<GallerySanPham> LayDanhSachGallerySanPham() {
		Session session =sessionFactory.getCurrentSession();
		String query ="from GALLERYSANPHAM";
		List<GallerySanPham> gallerySanPhams = session.createQuery(query).getResultList();
		
		return gallerySanPhams;
	}

}
