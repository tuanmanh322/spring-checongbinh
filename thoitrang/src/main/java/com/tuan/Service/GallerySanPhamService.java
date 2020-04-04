package com.tuan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuan.Dao.GallerySanPhamDAO;
import com.tuan.Entity.GallerySanPham;
import com.tuan.daoimpl.GallerySanPhamImpl;

@Service
public class GallerySanPhamService implements GallerySanPhamImpl{
@Autowired
GallerySanPhamDAO gallerySanPhamDAO;

public List<GallerySanPham> LayDanhSachGallerySanPham() {
	// TODO Auto-generated method stub
	return gallerySanPhamDAO.LayDanhSachGallerySanPham();
}
}
