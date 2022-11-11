package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.neko;

//@Repository // springのDIの対象となる
@Mapper // MybatisでxmlのSQLが対応づけられる

public interface NekoMapper {

	//	@Bean
	public ArrayList<neko> getNekoList();

	//	@Bean
	public boolean insertNeko(neko neko);
}
