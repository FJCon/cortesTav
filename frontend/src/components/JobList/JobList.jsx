import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'
import url from '../../utils/url'

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
        <h2>JobList</h2>
        <p>longitud del array: {jobs.length}</p>
    </>
    
  )
}

export default JobList