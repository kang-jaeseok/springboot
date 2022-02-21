package com.test.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.demo.dao.BoardDao;
import com.test.demo.vo.TransferVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDao boardDao;
	@Override
	@Transactional
	public Map<String, Object> mapProcedureList() {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>(); 
		map.put("num", 2);
		map.put("name", "홍길동");
		boardDao.mapProcedureList(map);
		return map;
	}
	@Override
	@Transactional
	public Map<String, Object> getEmpList() {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("age", 1);
		boardDao.getEmpList(map);
		return map;
	}
	@Override
	@Transactional
	public TransferVO procedureList() {
		// TODO Auto-generated method stub
		TransferVO transferVO = new TransferVO();
		transferVO.setNum(2);
		transferVO.setName("홍길동");
		boardDao.procedureList(transferVO);
		return transferVO;
	}
	@Override
	@Transactional
	public TransferVO anonymousBlockList() {
		// TODO Auto-generated method stub
		TransferVO transferVO = new TransferVO();
		transferVO.setNum(2);
		transferVO.setName("홍길동");
		boardDao.anonymousBlockList(transferVO);
		return transferVO;
	}

}
