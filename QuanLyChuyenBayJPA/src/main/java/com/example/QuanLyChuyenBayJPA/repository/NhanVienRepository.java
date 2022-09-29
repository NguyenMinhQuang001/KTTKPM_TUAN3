package com.example.QuanLyChuyenBayJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.QuanLyChuyenBayJPA.entity.NhanVien;

public interface NhanVienRepository  extends JpaRepository<NhanVien, String>{
	@Query(value = "select *from nhanvien where Luong < 10000", nativeQuery = true)
	public List<NhanVien> findNVLuongNH10000();
}