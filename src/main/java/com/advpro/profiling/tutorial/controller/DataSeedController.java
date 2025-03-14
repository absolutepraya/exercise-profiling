package com.advpro.profiling.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advpro.profiling.tutorial.service.DataSeedService;

/**
 * @author muhammad.khadafi
 */

@RestController
public class DataSeedController {

    @Autowired
    private DataSeedService dataSeedService;

    @GetMapping("/seed-data-master")
    public ResponseEntity<String> seedMaster() {
        dataSeedService.seedStudent();
        dataSeedService.seedCourse();

        return ResponseEntity.ok("Seeding data master completed successfully.");
    }

    @GetMapping("/seed-student-course")
    public ResponseEntity<String> seedStudents() {
        dataSeedService.seedStudentCourses();

        return ResponseEntity.ok("Seeding student course completed successfully.");
    }
}

