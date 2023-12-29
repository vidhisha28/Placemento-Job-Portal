package com.placement.dtos;

import com.placement.entity.Company;
import org.springframework.beans.BeanUtils;

public class CompanyDTO extends Company{

	private String pwd;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "CompanyDTO [pwd=" + pwd + "]";
	}
	
	public static Company toEntity(CompanyDTO dto) {
		Company entity=new Company();
		BeanUtils.copyProperties(dto, entity);		
		return entity;
	}
}
