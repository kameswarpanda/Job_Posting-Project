package com.task.jobposting.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.task.jobposting.entity.JobPosting;
import com.task.jobposting.repository.JobPostingRepository;

public class JobPostingServiceTest {
	
	@Mock
    private JobPostingRepository jobPostingRepository;

    @InjectMocks
    private JobPostingService jobPostingService;

    public JobPostingServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createJobPostingTest() {
        JobPosting jobPosting = new JobPosting();
        jobPosting.setTitle("Software Engineer");
        when(jobPostingRepository.save(jobPosting)).thenReturn(jobPosting);

        jobPostingService.createJobPosting(jobPosting);

        verify(jobPostingRepository, times(1)).save(jobPosting);
    }

    
}
