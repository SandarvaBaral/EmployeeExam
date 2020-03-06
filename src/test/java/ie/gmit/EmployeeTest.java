/*
    G00343312
    Sandarva Baral
    Group A
    Lab Exam
 */

package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EmployeeTest {

    Employee employee;

    @BeforeAll
    static void startingTests() {
        System.out.println("Starting the tests");
    }

    @BeforeEach
    void printDisplayNames(TestInfo testInfo, TestReporter testReporter){
        testReporter.publishEntry(testInfo.getDisplayName());
    }

    @AfterAll
    static void completeTests(){
        System.out.println("Testing Complete");
    }

    @DisplayName("Testing Constructor")
    @Test
    void testingConstructor(){
        employee = new Employee("Mr", "Sandarva Baral", "2844562K", "089207200",
                "Full-Time", 21);
        assertEquals("Mr",employee.getTitle());
        assertEquals("Sandarva Baral",employee.getName());
        assertEquals("2844562K",employee.getPpsNumber());
        assertEquals("089207200",employee.getPhone());
        assertEquals("Full-Time",employee.getEmploymentType());
        assertEquals(21,employee.getAge());
    }

    @DisplayName("Testing Title")
    @Test
    void testTitle(){
        Exception error = assertThrows(IllegalArgumentException.class,()->{
            employee = new Employee("MrMr", "Sandarva Baral", "2844562K","089207200",
                    "Full-Time",21);
        });
        assertEquals("Invalid Title, Must be Mr, Mrs or Ms",error.getMessage());
    }

    @DisplayName("Testing Name")
    @Test
    void testName(){
        Exception error = assertThrows(IllegalArgumentException.class,()->{
            employee = new Employee("Mr", "b", "2844562K","089207200",
                    "Full-Time",21);
        });
        assertEquals("Name must have a minimum of 3 characters or maximum of 25",error.getMessage());
    }

    @DisplayName("Testing PPS Number")
    @Test
    void testPPSNumber(){
        Exception error = assertThrows(IllegalArgumentException.class,()->{
            employee = new Employee("Mr", "Sandarva Baral", "2844","089207200",
                    "Full-Time",21);
        });
        assertEquals("PPS Number must be 8 character long",error.getMessage());
    }

    @DisplayName("Testing Phone Number")
    @Test
    void testPhoneNumber(){
        Exception error = assertThrows(IllegalArgumentException.class,()->{
            employee = new Employee("Mrs", "Sandarva Baral", "2844562K","089",
                    "Contract",21);
        });
        assertEquals("Phone number must be 9 character long",error.getMessage());
    }

    @DisplayName("Testing Employment Type")
    @Test
    void testEmploymentType(){
        Exception error = assertThrows(IllegalArgumentException.class,()->{
            employee = new Employee("Mrs", "Sandarva Baral", "2844562K","089207200",
                    "working free",21);
        });
        assertEquals("Invalid Employment Provided, Must be Full-Time, Part-Time or Contract",error.getMessage());
    }

    @DisplayName("Testing Age")
    @Test
    void testEmployeeAge(){
        Exception error = assertThrows(IllegalArgumentException.class,()->{
            employee = new Employee("Ms", "Sandarva Baral", "2844562K","089207200",
                    "Part-Time",15);
        });
        assertEquals("Employee age must be over 16",error.getMessage());
    }

}
