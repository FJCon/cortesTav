import React from 'react'
import './Menu.css'
import Swal from 'sweetalert2'
import { Link, useNavigate } from 'react-router-dom'

const Menu = () => {

  const handleClick = ()=>{
    Swal.fire(
      {
        title: "Menu no disponible aun",
        showConfirmButton: true,
        showCancelButton: false
      }
    )
  }

  

  return (
    <div className='menu-container'>
        <h2>
            Hola username
        </h2>
        <div className='options-container'>
            <Link to="/obras" className='option'>Lista de Obras</Link>
            <div className='option' onClick={handleClick}>Lista de nidos</div>
            <Link to='/piezas ' className='option'>Lista de piezas</Link>     
        </div>
    </div>
  )
}

export default Menu