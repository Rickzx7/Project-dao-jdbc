package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insertDepartment(Department department);
    void updateDepartment(Department department);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
