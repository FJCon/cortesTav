import { useState } from 'react'
import Login from './components/Login/Login';
import WorkList from './components/WokList/WorkList'
import './App.css'

function App() {
  const [user, setUser] = useState({});

  return (
    <>
      <Login/>
     {/*<WorkList/>*/}
    </>
  )
}

export default App
