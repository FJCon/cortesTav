import React from 'react'
import './Menu.css'

const Menu = () => {
  return (
    <div className='menu-container'>
        <h2>
            Hola username
        </h2>
        <div className='options-container'>
            <div className='option'>Lista de Obras</div>
            <div className='option'>Listade nidos</div>
            <div className='option'>Lista de piezas</div>     
        </div>
    </div>
  )
}

export default Menu