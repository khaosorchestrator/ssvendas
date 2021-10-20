package com.springdev.ssvendas.repositories;

import com.springdev.ssvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
