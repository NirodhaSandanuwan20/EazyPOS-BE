package com.bootcamp.pos.EzyPOS.service.impl;

import com.bootcamp.pos.EzyPOS.dto.request.CustomerDto;
import com.bootcamp.pos.EzyPOS.entity.Customer;
import com.bootcamp.pos.EzyPOS.repo.CustomerRepo;
import com.bootcamp.pos.EzyPOS.service.CustomerService;
import com.bootcamp.pos.EzyPOS.util.IdGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private IdGenerator idGenerator;

    @Override
    public String saveCustomer(CustomerDto dto) {
        // kamal => KML==> ( save data -> customer)==> KML-C-1
        // kamal => KML==> ( save data -> customer)==> KML-C-2

        // Jayantha => JXY==> ( save data -> customer)==> JXY-C-1

        Customer c1 = new Customer(
                idGenerator.generateId(10), dto.getName(), dto.getAddress(), dto.getSalary()
        );

        customerRepo.save(c1);
        return c1.getId() + " Saved!";
    }

    @Override
    public String findCustomer(String id) {
        return null;
    }

    @Override
    public String updateCustomer(CustomerDto dto, String id) {
        return null;
    }

    @Override
    public String deleteCustomer(String id) {
        return null;
    }

    @Override
    public String findAllCustomers() {
        return null;
    }
}
