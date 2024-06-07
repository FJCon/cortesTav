package com.tav.api_rest.Controllers;

import com.tav.api_rest.Model.Job;
import com.tav.api_rest.Services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private JobService jobServ;

    @Autowired
    public JobController(JobService jobServ){
        this.jobServ = jobServ;
    }

    @GetMapping
    public ResponseEntity<List<Job>> listarTrabajos(){
        return ResponseEntity.ok(jobServ.listJobs());
    }

    @GetMapping("/job/{cnc}")
    public Job getJobByNestCnc(@PathVariable String cnc) {
        return jobServ.findJob(cnc);
    }
}
