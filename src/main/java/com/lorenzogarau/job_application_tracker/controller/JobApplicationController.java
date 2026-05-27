package com.lorenzogarau.job_application_tracker.controller;

import com.lorenzogarau.job_application_tracker.entity.JobApplication;
import com.lorenzogarau.job_application_tracker.repository.JobApplicationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/job_applications")
public class JobApplicationController {

    private final JobApplicationRepository jobApplicationRepository;


    public JobApplicationController(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }


    @GetMapping()
    List<JobApplication> all() {
        return jobApplicationRepository.findAll();
    }

    //todo: aggiungere eccezione nel throw
    @GetMapping("/{id}")
    JobApplication one(@PathVariable Long id) {
        return jobApplicationRepository.findById(id).orElseThrow();
    }

}
