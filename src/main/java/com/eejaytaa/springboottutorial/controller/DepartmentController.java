package com.eejaytaa.springboottutorial.controller;


import com.eejaytaa.springboottutorial.entity.Department;
import com.eejaytaa.springboottutorial.service.DepartmentService;
import com.eejaytaa.springboottutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService deptService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return deptService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getDepartments(){
        return deptService.getDepartments();
    }

    @GetMapping("/departments/{departmentId}")
    public Department getDepartmentById(@PathVariable("departmentId") Long departmentId){
        return deptService.getDepartmentById(departmentId);
    }

    @GetMapping("/departments/name/{departmentName}")
    public Department getDepartmentByName(@PathVariable("departmentName") String departmentName){
        return deptService.getDepartmentByName(departmentName);
    }

    @DeleteMapping("/departments/{departmentId}")
    public String deleteDepartmentById(@PathVariable("departmentId") Long departmentId){
        deptService.deleteDepartmentById(departmentId);
        return "Department is deleted successfully.";
    }
    @PutMapping("/departments/{departmentId}")
    public Department updateDepartment(@PathVariable("departmentId") Long departmentId, @RequestBody Department department){
        return deptService.updateDepartment(departmentId, department);
    }
}
