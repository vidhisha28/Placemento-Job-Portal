package com.placement.services;

import com.placement.daos.JobApplicationRepository;
import com.placement.dtos.JobApplyDTO;
import com.placement.dtos.UpdateStatusDTO;
import com.placement.entity.Company;
import com.placement.entity.Job;
import com.placement.entity.JobApplication;
import com.placement.entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplyService {

	@Autowired JobApplicationRepository repo;
	@Autowired CompanyService cservice;
	@Autowired StudentService sservice;
	@Autowired EmailService emailService;
	
	public void saveApply(JobApplyDTO dto) {
		JobApplication job=new JobApplication();
		Job jj=cservice.getJobDetails(dto.getJid());
		job.setJob(jj);
		System.out.println(job);
		Student ss = sservice.findById(dto.getSid());
		job.setStudent(ss);
		job.setCompany(jj.getCompany());
		job.setStatus(dto.getStatus());
		job.setApplydate(dto.getApplydate());
		repo.save(job);
		Company cc= cservice.getDetails(jj.getCompany().getId());
		emailService.sendMail(cc.getEmail(), 
		"Job Applied for "+jj.getDesignation(), 
		"Job applied for "+jj.getDesignation()+" by "+ss.getSname()+" with roll no "+ss.getId());
	}
	
	public List<JobApplication> listAll(){
		return repo.findAll(Sort.by(Direction.DESC, "id"));
	}
	
	public JobApplication findDetails(int jid) {
		return repo.getById(jid);
	}
	
	public List<JobApplication> listStudentApplications(int sid){
		return repo.findByStudent(sservice.findById(sid));
	}
	
	public List<JobApplication> listCompanyApplication(int cid){
		return repo.findByCompanyAndStatus(cservice.getDetails(cid),"Applied");
	}
	
	public void udpateStatus(UpdateStatusDTO dto) {
		JobApplication ja=repo.getById(dto.getJid());
		ja.setStatus(dto.getStatus());
		repo.save(ja);
	}
	
	public List<JobApplication> listSelectedCandidates(){
		return repo.findByStatus("Approved");
	}
	
}
