import React, { useState } from 'react';
import './CutPiece.css';
import url from '../../../utils/url.js'
import { json } from 'react-router-dom';


const CutPiece = ( {nestId, nestCnc, onClose} ) => {

  const [body, setBody] = useState('');
  const fetchUrl = url.base + '/nests/update';
  console.log(fetchUrl);

  const hoy = new Date();
  const day = hoy.getDate();
  const month = hoy.getMonth() + 1;
  const year = hoy.getFullYear();
  const formatedDate = `${day}-${month}-${year}`;

  const confirm = ()=>{

    let nest = {
      id: nestId,
      cnc: nestCnc,
      data1: formatedDate,
    }

    setBody(nest);

    fetch(fetchUrl,{
      mode: 'cors',
      method: "PUT",
      headers: {
        'Access-Control-Allow-Origin': '*',
        Accept: 'application/json',
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(nest)
    })
    .then((res) => res.json())
    .then((data) => {
      console.log(data);
    })

    
  };

  
    
    
  return (
    <div>
        <h3>¿Desea marcar el nido como cortado?</h3>
        <p>{ body == "" ? "" : `nido: ${body.id} y cnc: ${body.cnc} cortado: ${body.data1}`}</p>
        <div>
            <button className='confirm' onClick={confirm}>Aceptar</button>
            <button onClick={onClose}>Cancelar</button>
        </div>
    </div>
  )
}

export default CutPiece