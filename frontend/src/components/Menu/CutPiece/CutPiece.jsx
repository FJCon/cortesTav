import React, { useState } from 'react'
import './CutPiece.css'

const CutPiece = ( {nestId, nestCnc, onClose} ) => {

  const [body, setBody] = useState('')

  const hoy = new Date();
  const day = hoy.getDate();
  const month = hoy.getMonth() + 1;
  const year = hoy.getFullYear();
  const formatedDate = `${day}/${month}/${year}`;
  const confirm = ()=>{
    let nest = {
      id: nestId,
      cnc: nestCnc,
      data1: formatedDate,
    }

    setBody(nest);
    
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