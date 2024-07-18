import React, { useState } from 'react'
import './JobCard.css'
import NestCard from './NestCard';
import Swal from 'sweetalert2';

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
    <div className='job-container' id={id} key={key} >
      <p className='job-name'onClick={clickHandle}>{name}</p>  
      <div className={`${divNests} hidden`}>
        <table>
        {(visibilitie && nestsArray.length != 0) ?
          <thead>
              <tr>
                <th>N° Nido</th>
                <th>Cant. piezas</th>
                <th>Fecha creacion</th>
                <th>Estado</th>
                <th>Acciones</th>
              </tr>
          </thead> : (visibilitie && nestsArray.length == 0) ? <h3>No hay nidos para mostrar</h3> : ''}
          <tbody>
            {visibilitie ? nestsArray.map( (nest)=>{return(
              <tr>
                <td>{nest.cnc}</td>
                <td>{nest.part.length}</td>
                <td>{nest.created.slice(0,10)}</td>
                <td>{nest.data1 == '' ? 'Programado' : 
                      nest.data1 != '' ? 'Cortado' : ''}</td>
              </tr>
              )}  ) : ''
            }
          </tbody>
        </table>
            {/*visibilitie ? nestsArray.map( (nest)=>{return <NestCard cnc={nest.cnc} />}  ) : ''*/}
      </div>
    </div>

  )
}

export default JobCard