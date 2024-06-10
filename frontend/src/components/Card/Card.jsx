import React from 'react'

const Card = ({ id, name}) => {

    const handleClick = ()=>{
      console.log
        window.open("","_blank")
    }
  return (
    <div key={id} onClick={handleClick}>
        <p>{name}</p>
    </div>
  )
}

export default Card