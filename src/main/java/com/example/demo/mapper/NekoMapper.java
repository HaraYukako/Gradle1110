package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Neko;

//@Repository // springのDIの対象となる
@Mapper // MybatisでxmlのSQLが対応づけられる

public interface NekoMapper {

	//	@Bean
	public ArrayList<Neko> getNekoList();

	//	@Bean
	public boolean insertNeko(Neko neko);
}
