package com.springdev.ssvendas.repositories;

import com.springdev.ssvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
