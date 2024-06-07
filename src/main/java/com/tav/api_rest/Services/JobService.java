package com.tav.api_rest.Services;

import com.tav.api_rest.Model.Job;
import com.tav.api_rest.Repositories.JobRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class JobService {

    private JobRepository jobRepo;

    @Autowired
    public JobService(JobRepository jobRepo){
        this.jobRepo=jobRepo;
    }

    public List<Job> listJobs() {
        return jobRepo.findAll();
    }

    public Job findJob(String cnc){
        return jobRepo.findJobByNestCnc(cnc);
    }

}
