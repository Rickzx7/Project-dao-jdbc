package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        System.out.println(department);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = new Seller(1, "Rick", "rick@gmail.com", new Date(), 3000.0, department);
        System.out.println(seller);
    }
}