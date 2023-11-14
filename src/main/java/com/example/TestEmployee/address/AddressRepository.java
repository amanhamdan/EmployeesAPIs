package com.example.TestEmployee.address;

import com.example.TestEmployee.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
