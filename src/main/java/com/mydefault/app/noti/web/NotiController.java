package com.mydefault.app.noti.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mydefault.app.common.util.GenericCode;
import com.mydefault.app.common.util.StringUtil;
import com.mydefault.app.generic.web.GenericController;
import com.mydefault.app.noti.service.NotiService;
import com.mydefault.app.noti.service.NotiVO;

@Controller
@RequestMapping("/noti/*")
public class NotiController extends GenericController<NotiVO, NotiService> {

	protected static final Logger logger = LoggerFactory.getLogger(NotiController.class);

	@Resource
	public NotiService notiService;

	protected NotiController() {
		super(NotiVO.class,NotiService.class);
	}
	
	@Override
	@RequestMapping({ "/list.do", "/search.do" })
	public String list(@ModelAttribute NotiVO entity, HttpServletRequest request, ModelMap model) throws Exception {
		setModelEntity(model, entity, "ivo");

		// entity 초기화
		if (retrieveUrlSub(request).indexOf("list") > -1) {
			entity = addReference(entity, model);
		}

		try {
			List<?> list = notiService.list();
			model.addAttribute("list", list);

		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		setModelEntity(model, entity, getNameVO());
		// return this.filePath + "/NotiRegister" ;
		return viewMapper("only","noti/NotiRegister");
		// return viewMapper(GenericCode.LIST);
	}
	
	@Override
	@RequestMapping({ "/regist.do" })
	public String regist(@ModelAttribute NotiVO entity, HttpServletRequest request, ModelMap model) throws Exception {
		setModelEntity(model, entity, "ivo");

		// entity 초기화
		if (retrieveUrlSub(request).indexOf("list") > -1) {
			entity = addReference(entity, model);
		}

		try {
			// List<?> list = notiService.list();
			// model.addAttribute("list", list);

		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		setModelEntity(model, entity, getNameVO());
		// return this.filePath + "/NotiRegister" ;
		return viewMapper("only","noti/NotiRegister");
		// return viewMapper(GenericCode.LIST);
	}
	
	
}
