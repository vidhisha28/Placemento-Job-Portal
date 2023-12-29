package com.placement.daos;

import com.placement.entity.Company;
import com.placement.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

	List<Job> findByCompanyOrderByIdDesc(Company company);
}
