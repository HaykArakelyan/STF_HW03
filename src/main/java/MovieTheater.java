import java.util.ArrayList;

public class MovieTheater {
    private ArrayList<String> movies;
    private ArrayList<String> employees;

    public MovieTheater(){}
    public MovieTheater(ArrayList<String> newMovies, ArrayList<String> newEmployees){
        movies = newMovies;
        employees = newEmployees;
    }

    public String addMovie(String movie){
        if(movies.contains(movie)){
            return "Already in the list!";
        }
        movies.add(movie);
        return movie;
    }

    public String getMovie(String movie){
        if(!movies.isEmpty() && movies.contains(movie)){
            return movie;
        }
        return "Not Available";
    }

    public String addEmployee(String employee){
        if(employees.size() > 50){
            return "No available vacancies";
        }
        employees.add(employee);
        return employee;
    }

    public String removeEmployee(String employee){
        if(employees.contains(employee)){
            employees.remove(employee);
            return employee;
        }
        return  "No Such Employee";
    }

    public String getEmployee(String employee){
        if(employees.contains(employee)){
            return employee;
        }
        return "No such employee";
    }


    public int getNumberOfEmployees(){
        return this.employees.size();
    }

    public int getNumberOfMovies(){
        return this.movies.size();
    }
}
