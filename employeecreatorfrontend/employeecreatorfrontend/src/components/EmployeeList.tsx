import EmployeeCard from "./EmployeeCard";

const EmployeeList = ({ employees }) => {

    console.log(employees);
    return (
      <div>
        {employees.map((employee, index) => (
          <EmployeeCard key={index} employee={employee} />
        ))}
      </div>
    );
  };
  
  export default EmployeeList;