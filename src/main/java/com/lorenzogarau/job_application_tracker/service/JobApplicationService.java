package com.lorenzogarau.job_application_tracker.service;

import com.lorenzogarau.job_application_tracker.entity.JobApplication;
import com.lorenzogarau.job_application_tracker.exception.ResourceNotFoundException;
import com.lorenzogarau.job_application_tracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public List<JobApplication> findAll() {
        return jobApplicationRepository.findAll();
    }

    public JobApplication findById(Long id) {
        return jobApplicationRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Job Application con id: " + id + " non è stata trovata"));
    }


}
