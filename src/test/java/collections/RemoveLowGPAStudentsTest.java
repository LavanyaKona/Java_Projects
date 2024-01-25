package collections;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class RemoveLowGPAStudentsTest {

    @Test
    public void testRemoveLowGPAStudentsNegative() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Smith", null));
        students.add(new Student("Bob", "Johnson", 3.0));

        RemoveLowGPAStudents.removeLowGPAStudents(students);

        assertEquals(1, students.size());
        assertEquals("John", students.get(0).getFirstName());
    }

    @Test
    public void testRemoveLowGPAStudentsZero() {
        ArrayList<Student> students = new ArrayList<>();
        RemoveLowGPAStudents.removeLowGPAStudents(students);

        assertEquals(0, students.size());
    }
}
