package com.lorenzogarau.job_application_tracker.service;

import com.lorenzogarau.job_application_tracker.dto.CreateJobApplicationRequest;
import com.lorenzogarau.job_application_tracker.dto.JobApplicationResponse;
import com.lorenzogarau.job_application_tracker.dto.UpdateJobApplicationRequest;
import com.lorenzogarau.job_application_tracker.entity.JobApplication;
import com.lorenzogarau.job_application_tracker.exception.ResourceNotFoundException;
import com.lorenzogarau.job_application_tracker.mapper.JobApplicationMapper;
import com.lorenzogarau.job_application_tracker.repository.JobApplicationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;
    private final JobApplicationMapper jobApplicationMapper;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository, JobApplicationMapper jobApplicationMapper) {
        this.jobApplicationMapper = jobApplicationMapper;
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public List<JobApplicationResponse> findAll() {
        List<JobApplication> jobApplicationList = jobApplicationRepository.findAll();
        return jobApplicationMapper.toResponseList(jobApplicationList);
    }


    public JobApplicationResponse findById(Long id) {
        JobApplication jobApplication = jobApplicationRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Job Application con id: " + id + " non è stata trovata"));
        return jobApplicationMapper.toResponse(jobApplication);
    }


    public JobApplicationResponse createApplication(CreateJobApplicationRequest dto) {
        JobApplication entity = jobApplicationMapper.createEntityFromRequest(dto);
        JobApplication savedEntity = jobApplicationRepository.save(entity);
        return jobApplicationMapper.toResponse(savedEntity);
    }


    public JobApplicationResponse updateApplication(Long id, UpdateJobApplicationRequest dto) {
        JobApplication entity = jobApplicationRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Job Application con id: " + id + " non è stata trovata"));
        jobApplicationMapper.updateEntity(dto, entity);
        JobApplication savedEntity = jobApplicationRepository.save(entity);
        return jobApplicationMapper.toResponse(savedEntity);
    }

    public ResponseEntity<String> deleteApplication(long id) {
        JobApplication entity = jobApplicationRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Job Application con id: " + id + " non è stata trovata"));
        jobApplicationRepository.delete(entity);
        return ResponseEntity.ok("Application eliminata con successo");
    }
}
