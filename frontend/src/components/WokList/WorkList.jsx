import React, { useEffect, useState } from 'react'
import './WorkList.css'
import url from '../../utils/url'
import WorkCard from '../Card/WorkCard';


const WorkList = () => {

  const [obras, setObras] = useState([]);
  const [filtered, setFiltered] = useState([]);
  console.log(`${url.base}/works`);

  const consulta = async ()=>{
    const data = await fetch(`${url.base}/works`);
    const response = await data.json();
    setObras(response);
    
  }
  useEffect(()=>{
    consulta();
  },[])

  const handleChange = (e)=>{
    const input = e.target.value;
    const filtrado = obras.filter(obra => obra.nodeName.toLowerCase().includes(input.toLowerCase()))
    setFiltered(filtrado)
    
  }


  return (
    <div className='worklist-container'>
      <h2>Listado de Obras</h2>
      <input type="text" placeholder='Buscar obra' onChange={handleChange}/>
      <div className='cards-container'>
        { filtered.length == 0 ? 
        obras.map((obra) =>{
          return <WorkCard id={obra.nodeId} name={obra.nodeName}/>}):
          filtered.map((obra) =>{
            return <WorkCard id={obra.nodeId} name={obra.nodeName}/>})
            }
      </div>
    </div>
  )
}

export default WorkList