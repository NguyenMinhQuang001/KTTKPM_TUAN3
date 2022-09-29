package com.example.QuanLyChuyenBayJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
	@Query(value = " select * from chuyenbay where GaDen = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysDaLat();

	@Query(value = " select * from chuyenbay where DoDai < 10000 and DoDai >8000", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysDoDaiNH10000LH8000();
}
