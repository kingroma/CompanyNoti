package com.mydefault.app.noti.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
DROP TABLE T_NOTI ; 
CREATE TABLE T_NOTI (
	NOTI_ID VARCHAR(30) PRIMARY KEY , 
	NOTI_TITLE VARCHAR(1000) NOT NULL ,
	NOTI_NICK_NAME VARCHAR(1000) NOT NULL ,  
	NOTI_DE VARCHAR(14) NOT NULL , 
	NOTI_TEXT VARCHAR(8000) NOT NULL   
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 * */
public class NotiVO {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	
	private String notiId ; 

	private String notiNickName;
	
	private String notiTitle ; 
	
	private String notiDe ; 
	
	private String notiText ;

	public void emptyChecker() {
		if ( notiNickName == null )
			notiNickName = "";
		if ( notiTitle == null )
			notiTitle = "";
		if ( notiDe == null ) {
			try {
				notiDe = sdf.format(new Date());
			} catch (Exception e) {}
		}
		if ( notiText == null )
			notiText = "";
		
	}
	
	public String getNotiId() {
		return notiId;
	}

	public void setNotiId(String notiId) {
		this.notiId = notiId;
	}

	public String getNotiTitle() {
		return notiTitle;
	}

	public void setNotiTitle(String notiTitle) {
		this.notiTitle = notiTitle;
	}

	public String getNotiDe() {
		return notiDe;
	}

	public void setNotiDe(String notiDe) {
		this.notiDe = notiDe;
	}

	public String getNotiText() {
		return notiText;
	}

	public void setNotiText(String notiText) {
		this.notiText = notiText;
	}

	public String getNotiNickName() {
		return notiNickName;
	}

	public void setNotiNickName(String notiNickName) {
		this.notiNickName = notiNickName;
	} 
	
	@Override
	public String toString() {
		return 
				"notiId=" + notiId + 
				"notiNickName=" + notiNickName + 
				"notiTitle="+notiTitle +
				"notiDe=" + notiDe + 
				"notiText=" + notiText; 
	}
	
}
