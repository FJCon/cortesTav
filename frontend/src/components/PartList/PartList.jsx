import React, { useEffect, useState } from 'react'
import url from '../../utils/url'
import './PartList.css'
import Spinner from '../Spinner/Spinner'

const PartList = () => {
  const [parts, setParts] = useState([]);
  const [filtered, setFiltered] = useState([]);
  const [isLoading, setIsLoading] = useState(true);

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
  
  const handleChange = (e)=>{
    const input = e.target.value;
    const filtrado = parts.filter(part => part.prdRef.toLowerCase().includes(input.toLowerCase()))
    setFiltered(filtrado)
  }



  return (
    isLoading ? <Spinner/> :
    <div className='main-parts-container'>
      <div className='filter-container'>
        <p></p>
        <input type="text" placeholder='Buscar piezas' onChange={handleChange}/>
      </div>
      <div className='table-container'>
        <table className='parts-table'>
            <thead>
                <tr>
                    <th>PIEZA</th>
                    <th>ESPESOR</th>
                    <th>CANTIDAD</th>
                    <th>ACCIONES</th>
                </tr>
            </thead>
            <tbody>
              {filtered.length == 0 ? 
               parts.map( part =>{
                return(
                <tr key={part.id} id={part.id}>
                    <td className="left">{part.prdRef}</td>
                    <td>{part.nstThickness}</td>
                    <td>{part.quantity}</td>
                    <td></td>
                </tr>)
               }) :
               filtered.map( part =>{
                return(
                <tr key={part.id} id={part.id}>
                    <td className="left">{part.prdRef}</td>
                    <td>{part.nstThickness}</td>
                    <td>{part.quantity}</td>
                    <td></td>
                </tr>)
               })}
            </tbody>
        </table>
      </div>
    </div>
  )
}

export default PartList