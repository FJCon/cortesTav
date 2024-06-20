import React, { useState } from 'react'
import './JobCard.css'
import NestCard from './NestCard';

const JobCard = ({key, id, name, array }) => {

  const [nestsArray, setNestsArray] = useState(array);
  const [visibilitie, SetVisibilitie] = useState(false);

  const divNests = `nest-${id}`;
  console.log(divNests);
    
  const div = document.getElementById(id);
  const nests = document.querySelector('div.' + divNests)


  const clickHandle = ()=>{
    div.classList.toggle('extended');
    if(nests.classList.contains('hidden')){
      nests.classList.add('nests-container');
      nests.classList.remove('hidden');
      SetVisibilitie(true);
    }else{
      nests.classList.remove('nests-container');
      nests.classList.add('hidden');
      SetVisibilitie(false);
    }
  }


  return (
    <div className='job-container' id={id} key={key} onClick={clickHandle}>
      <p className='job-name'>{name}</p>  
      <div className={`${divNests} hidden`}>
          {visibilitie ? nestsArray.map( (nest)=>{return <NestCard cnc={nest.cnc} />}  ) : ''}
      </div>
    </div>

  )
}

export default JobCard