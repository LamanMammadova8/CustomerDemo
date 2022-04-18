package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entities.concretes.Customer;

public class BaseCustomer implements CustomerDao{
    @Override
    public void save(Customer customer) {
        System.out.println("Müştəri məlumatları Verilənlər bazasına daxil edildi: "+customer.getFirstName()+" "+customer.getLastName());
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Müştəri məlumatları yeniləndi: "+customer.getFirstName()+" "+customer.getLastName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Müştəri məlumatları silindi: "+customer.getFirstName()+" "+customer.getLastName());
    }
}
