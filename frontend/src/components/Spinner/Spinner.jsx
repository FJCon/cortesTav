import React from 'react'
import './Spinner.css'

const Spinner = () => {
  return (
    <div>
        <img className="loading-spinner" src="./icons/EosIconsBubbleLoading.svg" alt="" />
        <p>Cargando...</p>
    </div>
  )
}

export default Spinner