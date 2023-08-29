
const EmployeeCard = ({employee}) => {
  console.log(employee);
  return (
    <div>
        <h2>{employee.firstName}</h2>
        <p>{employee.lastName}</p>
    </div>
  )
}

export default EmployeeCard