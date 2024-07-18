import React from 'react'
import './WorkCard.css'
import { Link, useNavigate } from 'react-router-dom'

const Card = ({ id, name}) => {

    const handleClick = ()=>{
        window.open(`/obras/${id}`)
    }
  return (
    <Link className='card-container' key={id} to={`/obras/${id}`}>
        <p>{name}</p>
    </Link>
  )
}

export default Card