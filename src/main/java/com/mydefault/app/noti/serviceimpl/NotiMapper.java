package com.mydefault.app.noti.serviceimpl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mydefault.app.generic.serviceimpl.GenericMapper;
import com.mydefault.app.noti.service.NotiVO;

@Mapper
public interface NotiMapper extends GenericMapper<NotiVO>{
	
	
}
