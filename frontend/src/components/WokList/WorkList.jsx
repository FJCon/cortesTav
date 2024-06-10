import React, { useEffect, useState } from 'react'
import url from '../../utils/url'
import Card from '../Card/Card';

const WorkList = () => {

  const [obras, setObras] = useState([]);
  console.log(`${url.base}works`);

  const consulta = async ()=>{
    const data = await fetch(`${url.base}works`);
    const response = await data.json();
    setObras(response);
    
  }
  useEffect(()=>{
    consulta();
    console.log(obras)
    
    
  },[])
  return (
    <div>
        <h2>Obras</h2>
        {obras.map((obra) =>{
          return <Card id={obra.nodeId} name={obra.nodeName}/>})}
    </div>
  )
}

export default WorkList