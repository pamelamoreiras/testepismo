package com.pamelamoreiras.testepismo.repositories;

import com.pamelamoreiras.testepismo.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {

    Accounts findAccountByDocumentNumber(String documentNumber);
}
