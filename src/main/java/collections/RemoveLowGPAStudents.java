package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveLowGPAStudents {

    public static ArrayList<Student> removeLowGPAStudents(ArrayList<Student> students) {
        if (students != null && !students.isEmpty()) {
            double totalGPA = 0.0;
            int count = 0;

            ListIterator<Student> iterator = students.listIterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student != null && student.getGPA() != null) {
                    totalGPA += student.getGPA();
                    count++;
                } else {

                    System.out.println("Removing student: " + student);
                    iterator.remove();
                }
            }

            if (count > 0) {
                double averageGPA = totalGPA / count;

                iterator = students.listIterator();

                while (iterator.hasNext()) {
                    Student student = iterator.next();
                    if (student.getGPA() < averageGPA) {
                        System.out.println("Removing student with low GPA: " + student);
                        iterator.remove();
                    }
                }
            }
        }
        return students;
    }
}
