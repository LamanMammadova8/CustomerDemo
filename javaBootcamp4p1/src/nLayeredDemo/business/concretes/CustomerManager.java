package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.CustomerService;
import nLayeredDemo.dataAccess.abstracts.CustomerDao;
import nLayeredDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
    private CustomerDao customerDao;
    public CustomerManager(){

    };
    public CustomerManager(CustomerDao customerDao){
        super();
        this.customerDao=customerDao;
    }
    @Override
    public void save(Customer customer) {
        if (customer.getId()==1){
            System.out.println("Müştəri məlumatları yanlışdır!");
            return;
        }
        this.customerDao.save(customer);
    }


}
