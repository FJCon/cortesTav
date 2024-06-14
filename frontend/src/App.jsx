import { useState } from 'react'
import Login from './components/Login/Login';
import WorkList from './components/WokList/WorkList'
import './App.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import JobList from './components/JobList/JobList';

function App() {
  const [user, setUser] = useState({});

  return (
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<WorkList/>} ></Route>
          <Route path="/login" element={<Login/>} />
          <Route path="/obras/:id" element={<JobList />} />
        </Routes>
      </BrowserRouter>
  )
}

export default App
