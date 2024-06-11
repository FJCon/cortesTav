import React from 'react'
import './Login.css'

const Login = () => {
  return (
    <div className='login-container'>
        <h3>TAV INGENIERIA</h3>
        <form action="">
            <input type="text" placeholder='Ingrese su usuario'/>
            <input type="text" placeholder='Ingrese su contraseña'/>
            <button>Iniciar sesión</button>
        </form>
    </div>
  )
}

export default Login