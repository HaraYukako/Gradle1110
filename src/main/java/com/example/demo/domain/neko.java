package com.example.demo.domain;

import lombok.Data;

@Data // Lombokでgetterやsetterを自動生成
public class Neko {
	private int id;
	private String name;
	private int age;

	//ファイル名が変更されません
	//今日も変更されませんね
}