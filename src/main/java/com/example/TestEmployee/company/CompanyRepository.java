package com.example.TestEmployee.company;

import com.example.TestEmployee.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
