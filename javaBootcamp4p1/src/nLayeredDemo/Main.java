package nLayeredDemo;

import nLayeredDemo.business.concretes.CustomerManager;
import nLayeredDemo.dataAccess.abstracts.BaseCustomer;
import nLayeredDemo.dataAccess.concretes.NeroDao;
import nLayeredDemo.dataAccess.concretes.StarbucksDao;
import nLayeredDemo.entities.concretes.Customer;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Customer customer=new Customer(1, 843703742,"Laman", "Mammadova", "30.07.2000");
        Customer customer1=new Customer(2,8437321,"Zeyneb","Seyidova", "28.09.2000");
        Customer customer2=new Customer(3,9872398,"Behruz", "Memmedov","15.10.2001");

        CustomerManager customerManager=new CustomerManager(new NeroDao());
        customerManager.save(customer);

        BaseCustomer baseCustomer=new BaseCustomer();
        baseCustomer.delete(customer1);
        baseCustomer.update(customer2);
    }
}
