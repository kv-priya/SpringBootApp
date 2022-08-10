package com.bezkoder.spring.jpa.h2.controller;

import com.bezkoder.spring.jpa.h2.model.Department;
import com.bezkoder.spring.jpa.h2.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;


    
    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = service.getAllDepartment();
        return ResponseEntity.ok().body(list);
    }


    
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
    	Department department = service.getDepartmentById(id);
        return ResponseEntity.ok().body(department);
    }



    @PostMapping
    public ResponseEntity<?> save(@RequestBody Department department) {
        Department savedDepartment = service.saveDepartment(department);
        
//        return ResponseEntity.ok().body(savedEmployee);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
        		.path("/{id}")
        		.buildAndExpand(savedDepartment.getId())
        		.toUri();
        return ResponseEntity.created(uri).body(savedDepartment);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Department department) {
    	Department updatedDepartment = null;
        updatedDepartment = service.updateDepartment(id, department);
        return ResponseEntity.ok().body(updatedDepartment);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.deleteDepartment(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }
}

