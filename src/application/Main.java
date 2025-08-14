package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("======= Test1 : Seller findByID====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("======Test 2: Seller findByDepartmentId====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartmentId(department);
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("======Test 3: Seller findByAll====");
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("======Test 4: Seller insert====");
        Seller newSeller = new Seller(null, "Isaac", "Isaac@gmail.com", new Date(), 4000.0, department);
        sellerDao.insertSeller(newSeller);
        System.out.println("Seller inserted successfully. NEW ID: " + newSeller.getId());


    }
}