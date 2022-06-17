package com.eejaytaa.springboottutorial.service;


import com.eejaytaa.springboottutorial.entity.Department;
import com.eejaytaa.springboottutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
         departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department departmentList =  departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(departmentList.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            departmentList.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(departmentList.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            departmentList.setDepartmentName(department.getDepartmentAddress());
        }
        if(Objects.nonNull(departmentList.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            departmentList.setDepartmentName(department.getDepartmentCode());
        }
        return departmentRepository.save(departmentList);
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }
}
