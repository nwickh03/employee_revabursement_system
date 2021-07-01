package com.revature.ers.repository;

import com.revature.ers.model.Reimbursement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReimbursementRepository extends JpaRepository<Reimbursement, Integer> {
    @Query("SELECT r from Reimbursement r WHERE r.author.userId = ?1")
    Page<Reimbursement> findByAuthorId(int userId, PageRequest pageRequest);
}
