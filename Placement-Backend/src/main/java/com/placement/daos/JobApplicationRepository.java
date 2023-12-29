package com.placement.daos;

import com.placement.entity.Company;
import com.placement.entity.JobApplication;
import com.placement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Integer> {

	List<JobApplication> findByStudent(Student student);
	List<JobApplication> findByCompanyAndStatus(Company company,String status);
	List<JobApplication> findByStatus(String status);
}
