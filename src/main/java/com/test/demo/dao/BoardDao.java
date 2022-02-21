package com.test.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.test.demo.vo.TransferVO;

@Mapper
public interface BoardDao {
	void mapProcedureList(Map<String, Object> map);
	void getEmpList(Map<String, Object> map);
	void procedureList(TransferVO transferVO);
	void anonymousBlockList(TransferVO transferVO);
}
