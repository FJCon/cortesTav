import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'
import url from '../../utils/url'
import JobCard from '../Card/JobCard';

const JobList = () => {
    
    const { id } = useParams();
    const [jobs, setJobs] = useState([]);
    const urlFetch = `${url.base}/folders/${id}`;
    console.log(urlFetch)

    const consulta = async ()=>{
        const data = await fetch(`${url.base}/folders/${id}`);
        const response = await data.json();
        setJobs(response);
        
      }

    useEffect(()=>{
        consulta();
        console.log(jobs);
    }, id)

  return (
    <>
        <h2>Lista de Cortes</h2>
        <div>
          {jobs.map((job) => {return <JobCard key={job.id} name={job.jobs[0].info} />})}
        </div>
    </>
    
  )
}

export default JobList