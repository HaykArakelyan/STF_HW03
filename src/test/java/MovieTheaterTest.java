import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieTheaterTest {
    @Test
    void addMovieThatDoesNotExist(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        assertEquals("Up", Up.addMovie("Up"));
    }

    @Test
    void addMovieThatExists(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        Up.addMovie("Up");
        assertNotEquals("Up", Up.addMovie("Up"));
    }

    @Test
    void getExistingMovie(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        Up.addMovie("Up");
        assertEquals("Up", Up.getMovie("Up"));
    }

    @Test
    void getNoneExistingMovie(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        assertNotEquals("Up", Up.getMovie("Up"));
    }

    @Test
    void addEmployee(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        assertEquals("Hayk", Up.addEmployee("Hayk"));
    }

    @Test
    void addEmployeeButNoSpace(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        for (int i = 0; i < 51; i++) {
            Up.addEmployee("Hayk" + i);
        }
        assertEquals("No available vacancies", Up.addEmployee("AnotherHayk"));
    }

    @Test
    void getNumberOfEmployees(){
        ArrayList<String> arr = new ArrayList<>(3);
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        assertEquals(arr.size(), Up.getNumberOfEmployees());
    }


    @Test
    void numberOfEmployeeAfterAdd(){
        ArrayList<String> arr = new ArrayList<>(3);
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        Up.addEmployee("Hayk");
        assertEquals(arr.size() + 1, Up.getNumberOfEmployees());
    }

    @Test
    void removeEmployee(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        Up.addEmployee("Hayk");
        assertEquals("Hayk", Up.removeEmployee("Hayk"));
    }

    @Test
    void removeNoneEmployee(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        assertEquals("No Such Employee", Up.removeEmployee("Hayk"));
    }

    @Test
    void numberOfEmployeeAfterRemove(){
        ArrayList<String> arr = new ArrayList<>(3);
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        Up.addEmployee("Hayk");
        Up.removeEmployee("Hayk");
        assertEquals(arr.size(), Up.getNumberOfEmployees());
    }

    @Test
    void getExistingEmployee(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        Up.addEmployee("Hayk");
        assertEquals("Hayk", Up.getEmployee("Hayk"));
    }

    @Test
    void getNoneExistingEmployee(){
        MovieTheater Up = new MovieTheater(new ArrayList<>(), new ArrayList<>());
        assertEquals("No such employee", Up.getEmployee("Hayk"));
    }
}