package com.lorenzogarau.job_application_tracker.repository;

import com.lorenzogarau.job_application_tracker.entity.JobApplication;
import com.lorenzogarau.job_application_tracker.enums.ApplicationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

    List<JobApplication> findByStatus(ApplicationStatus status);

    List<JobApplication> findByCompanyContaining(String company);

    List<JobApplication> findByFollowUpDate(LocalDateTime followUpDate);
}
