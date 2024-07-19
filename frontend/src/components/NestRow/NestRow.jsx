import React from 'react'
import './NestRow.css'
import { useState } from 'react';
import Swal from 'sweetalert2';
import withReactContent from 'sweetalert2-react-content'
import PartsTable from '../PartsTable/PartsTable';

const NestRow = ({ nest }) => {

    const [array, setArray] = useState(nest);

    const MySwal = withReactContent(Swal);

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
            title:`Nido ${array.cnc}`,
            text: 'Ventana para renderizar menu para editar el estado del nido (cortado, almacenado, utilizado, etc)'
        })
    }

    const click03 = ()=>{
        alert('Se mostrará archivo PDF del nido N° ' + array.cnc)
    }

  return (
    <tr>
        <td>{array.cnc}</td>
        <td>{array.part.length}</td>
        <td>{array.created.slice(0,10)}</td>
        <td>{array.data1 == '' ? 'Programado' : 
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