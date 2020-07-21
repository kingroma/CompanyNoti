package com.mydefault.app.noti.serviceimpl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.mydefault.app.generic.serviceimpl.GenericServiceImpl;
import com.mydefault.app.noti.service.NotiService;
import com.mydefault.app.noti.service.NotiVO;

@Service
public class NotiServiceImpl extends GenericServiceImpl<NotiVO,NotiMapper> implements NotiService {

	public NotiServiceImpl() {
		super(NotiMapper.class);
	}

	@Override
	public NotiVO insert(NotiVO entity, HttpServletRequest request) throws Exception {
		entity.emptyChecker();
		return super.insert(entity, request);
	}
	
	
}
