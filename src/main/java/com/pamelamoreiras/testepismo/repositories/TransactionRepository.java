package com.pamelamoreiras.testepismo.repositories;

import com.pamelamoreiras.testepismo.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Integer> {
}
