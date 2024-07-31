import React, { useEffect, useState } from 'react'
import url from '../../utils/url'
import './PartList.css'
import Spinner from '../Spinner/Spinner'

const PartList = () => {
    const [parts, setParts] = useState([]);
    const [isLoading, setIsLoading] = useState(true)

    const consulta = async ()=>{
        const data = await fetch(`${url.base}/parts`);
        const response = await data.json();
        setParts(response);
        setIsLoading(false);
      }

    useEffect(()=>{
        consulta();
        console.log(parts);
    },[])


  return (
    isLoading ? <Spinner/> :
    <table>
        <thead>
            <tr>
                <th>PIEZA</th>
                <th>ESPESOR</th>
                <th>CANTIDAD</th>
                <th>ACCIONES</th>
            </tr>
        </thead>
        <tbody>
           {parts.map( part =>{
            return(
            <tr key={part.id} id={part.id}>
                <td className="left">{part.prdRef}</td>
                <td>{part.nstThickness}</td>
                <td>{part.quantity}</td>
            </tr>)
           })}
        </tbody>
    </table>
  )
}

export default PartList