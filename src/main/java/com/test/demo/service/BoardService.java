package com.test.demo.service;

import java.util.Map;

import com.test.demo.vo.TransferVO;

public interface BoardService {
	public Map<String, Object> mapProcedureList();
	public Map<String, Object> getEmpList();
	public TransferVO procedureList();
	public TransferVO anonymousBlockList();
}
