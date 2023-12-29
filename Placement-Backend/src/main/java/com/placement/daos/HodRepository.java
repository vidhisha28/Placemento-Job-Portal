package com.placement.daos;

import com.placement.entity.HOD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HodRepository extends JpaRepository<HOD, Integer> {

}
