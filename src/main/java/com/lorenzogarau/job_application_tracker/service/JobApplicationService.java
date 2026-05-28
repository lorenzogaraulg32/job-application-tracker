package com.lorenzogarau.job_application_tracker.service;

import com.lorenzogarau.job_application_tracker.dto.JobApplicationDTO;
import com.lorenzogarau.job_application_tracker.entity.JobApplication;
import com.lorenzogarau.job_application_tracker.exception.ResourceNotFoundException;
import com.lorenzogarau.job_application_tracker.mapper.JobApplicationMapper;
import com.lorenzogarau.job_application_tracker.repository.JobApplicationRepository;
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

    public List<JobApplicationDTO> findAll() {
        List<JobApplication> jobApplicationList = jobApplicationRepository.findAll();
        return jobApplicationMapper.toDTOList(jobApplicationList);
    }


    public JobApplicationDTO findById(Long id) {
        JobApplication jobApplication = jobApplicationRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Job Application con id: " + id + " non è stata trovata"));
        return jobApplicationMapper.toDTO(jobApplication);
    }


    public JobApplicationDTO createApplication(JobApplicationDTO dto) {
        JobApplication entity = jobApplicationMapper.toEntity(dto);
        JobApplication savedEntity = jobApplicationRepository.save(entity);
        return jobApplicationMapper.toDTO(savedEntity);
    }

}
