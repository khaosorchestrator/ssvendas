package com.ssvendas.repositories;

import com.ssvendas.dto.SaleSuccessDTO;
import com.ssvendas.dto.SaleSumDTO;
import com.ssvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.ssvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale As obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.ssvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale As obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
