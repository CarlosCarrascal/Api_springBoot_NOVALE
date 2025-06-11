package com.hospital.backend.catalog.repository;

import com.hospital.backend.catalog.entity.PaymentMethod;
import com.hospital.backend.enums.PaymentMethodType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
    
    List<PaymentMethod> findByIsActiveTrue();
    
    Page<PaymentMethod> findByIsActive(Boolean isActive, Pageable pageable);
    
    List<PaymentMethod> findByTypeAndIsActiveTrue(PaymentMethodType type);
    
    boolean existsByNameAndType(String name, PaymentMethodType type);
}
