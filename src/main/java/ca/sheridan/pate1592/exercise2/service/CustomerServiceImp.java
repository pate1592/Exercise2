package ca.sheridan.pate1592.exercise2.service;

import ca.sheridan.pate1592.exercise2.model.Customer;
import ca.sheridan.pate1592.exercise2.repository.ControllerEntity;
import ca.sheridan.pate1592.exercise2.repository.CustomerRepositoryJpa;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImp implements CustomerService{

    private final CustomerRepositoryJpa customerRepositoryJpa;

    public CustomerServiceImp(CustomerRepositoryJpa customerRepositoryJpa) {
        this.customerRepositoryJpa = customerRepositoryJpa;
    }

    @Override
    public List<Customer> getCustomer() {
        List<ControllerEntity> entities = customerRepositoryJpa.findAll();
        List<Customer> customers = new ArrayList<>();
        for(ControllerEntity entity : entities){
            customers.add(
                    new Customer(
                            entity.getCUSTOMER_ID(),
                            entity.getFIRST_NAME(),
                            entity.getLAST_NAME(),
                            entity.getEMAIL(),
                            entity.getSTREET(),
                            entity.getCITY(),
                            entity.getSTATE(),
                            entity.getZIP_CODE()
                    )
            );
        }
        return customers;
    }
}
