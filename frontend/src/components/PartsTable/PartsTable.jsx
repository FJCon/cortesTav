import React, { useState } from 'react';

const PartsTable = ({partsArray}) => {
    const [parts, setParts] = useState(partsArray);

  return (
    <div>
        <table>
            <thead>
                <th>Pieza</th>
                <th>Cantidad</th>
            </thead>
            <tbody>
                {parts.map( (part) =>{ return(
                    <tr>
                        <td>{part.prdRef}</td>
                        <td>{part.quantity}</td>
                    </tr>
                )})}
            </tbody>
        </table>
    </div>
  )
}

export default PartsTable