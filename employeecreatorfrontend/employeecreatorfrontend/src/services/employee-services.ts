export const fetchEmployees = async () => {
    try {
        const response = await fetch("http://localhost:8080/employees");

        if(!response.ok) {
            throw new Error("Error in fetching employees.")
        }

        const data = await response.json();
        return data; 

    } catch(error) {
        console.error("An error occurred while fetching employees:", error);
        throw error;
    }

}
