package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insertSeller(Seller seller);
    void updateSeller(Seller seller);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Seller> findAll();
}
