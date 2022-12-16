package com.bootcamp.pos.EzyPOS.repo;

import com.bootcamp.pos.EzyPOS.entity.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;


@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer, String> {

    @Query(value = "SELECT * FROM customer",nativeQuery = true)
    public List<Customer> searchCustomer(String searchText, Pageable pageable);
/* WHERE name LIKE%?0% OR address LIKE%?0%*/
    @Query(value = "SELECT COUNT(id) FROM customer",
            nativeQuery = true)
    public long countCustomer(String searchText);
/* WHERE name LIKE %?0% OR address LIKE %?0%*/
}
