package com.revature.ers.repository;

import com.revature.ers.model.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReimbursementRepository extends JpaRepository<Reimbursement, Integer> {
}
