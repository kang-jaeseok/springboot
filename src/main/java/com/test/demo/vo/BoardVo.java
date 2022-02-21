package com.test.demo.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVo {
	private Integer num;
	private String name;
	private String title;
	private String content;
	private Integer readCount;
	private Date writeDate;
	               
	
}
