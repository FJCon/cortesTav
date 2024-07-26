import React from 'react'
import './NestRow.css'
import { useState } from 'react';
import Swal from 'sweetalert2';
import withReactContent from 'sweetalert2-react-content'
import PartsTable from '../PartsTable/PartsTable';
import CutPiece from '../Menu/CutPiece/CutPiece';

const NestRow = ({ nest }) => {

    const fecha = new Date(nest.created);
    const opciones = { year: 'numeric', month: '2-digit', day: '2-digit' };
    const fechaFormateada = fecha.toLocaleDateString('es-ES', opciones);

    const [array, setArray] = useState(nest);
    const [showSwal, setShowSwal] = useState(false);

    const handleCloseSwal = ()=>{
        setShowSwal(false);
    }

    const MySwal = withReactContent(Swal);
    
    const cerrar = ()=>{
        MySwal.close();
    }

    const click01 = ()=>{
        MySwal.fire({
            html:<PartsTable partsArray={array.part} />,
            width: '80vw',
            showCloseButton: true,
            showConfirmButton: false
        })
    }

    const click02 = ()=>{
        MySwal.fire({
            html: <CutPiece nestId={array.id} nestCnc={array.cnc} onClose={cerrar}/>,
            showConfirmButton: false,
        
        })
    }

    const click03 = ()=>{
        alert('Se mostrará archivo PDF del nido N° ' + array.cnc)
    }

  return (
    <tr>
        <td>{array.cnc}</td>
        <td>{array.part.length}</td>
        <td>{array.data1 == '' ? `Programado: ${fechaFormateada}` : 
              array.data1 != '' ? `Cortado: ${array.data1}` : ''}</td>
        <td>
            <button onClick={click01}><img src="/icons/info.svg" alt="información" /></button>
            <button onClick={click02}><img src="/icons/edit.svg" alt="información" /></button>
            <button onClick={click03}><img src="/icons/pdf.svg" alt="información" /></button> 
        </td>
    </tr>
  )
}

export default NestRow