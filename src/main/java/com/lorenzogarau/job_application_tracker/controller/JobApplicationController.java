package com.lorenzogarau.job_application_tracker.controller;

import com.lorenzogarau.job_application_tracker.entity.JobApplication;
import com.lorenzogarau.job_application_tracker.service.JobApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/job_applications")
public class JobApplicationController {


    private final JobApplicationService jobApplicationService;

    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }


    @GetMapping()
    List<JobApplication> all() {
        return jobApplicationService.findAll();
    }

    //todo: aggiungere eccezione nel throw
    @GetMapping("/{id}")
    JobApplication one(@PathVariable Long id) {
        return jobApplicationService.findById(id);
    }

}
