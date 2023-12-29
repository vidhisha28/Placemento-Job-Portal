package com.placement.dtos;

import com.placement.entity.HOD;
import org.springframework.beans.BeanUtils;

public class HodDto extends HOD {

	private String pwd;

	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public static HOD toEntity(HodDto dto) {
		HOD entity=new HOD();
		BeanUtils.copyProperties(dto, entity);		
		return entity;
	}
}
