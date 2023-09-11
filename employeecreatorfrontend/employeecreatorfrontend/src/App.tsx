import { useEffect, useState } from 'react'
import './App.css'
import { fetchEmployees } from './services/employee-services';
import EmployeeList from './components/EmployeeList';

function App() {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    fetchEmployees()
    .then((employees) =>
    setEmployees(employees))
    .catch((error) => console.log(error))
  },[]);

  return (
    <>
      <EmployeeList employees={employees}/>
    </>
  )
}

export default App
