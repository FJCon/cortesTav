import { useState } from 'react'
import Login from './components/Login/Login';
import WorkList from './components/WokList/WorkList'
import './App.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import JobList from './components/JobList/JobList';
import CutPiece from './components/Menu/CutPiece/CutPiece';

function App() {
  const [user, setUser] = useState({});

  return (
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<WorkList/>} ></Route>
          <Route path="/login" element={<Login/>} />
          <Route path="/obras/:id" element={<JobList />} />
          <Route path='/updatenest' element={ <CutPiece />} />
        </Routes>
      </BrowserRouter>
  )
}

export default App
