package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entities.concretes.Customer;

public interface CustomerDao {
    void save(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
