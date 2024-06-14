import React from 'react'

const JobCard = ({id, name }) => {
  return (
    <p key={id}>{name}</p>
  )
}

export default JobCard