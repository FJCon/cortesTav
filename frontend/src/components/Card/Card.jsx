import React from 'react'
import './Card.css'

const Card = ({ id, name}) => {

    const handleClick = ()=>{
      console.log
        window.open("","_blank")
    }
  return (
    <div className='card-container' key={id} onClick={handleClick}>
        <p>{name}</p>
    </div>
  )
}

export default Card