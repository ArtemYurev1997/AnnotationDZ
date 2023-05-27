package by.pvt.annotation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnnotationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of field");
        String field = scanner.nextLine();
        System.out.println("Enter value of field");
        String value = scanner.nextLine();
        var students = getPatientsByField(field, value);
        System.out.println(students);
    }

    public static List<Patient> getPatientsByField(String field, String value) {
        Patient patient1 = new Patient("Ivan", "Ivanov", "3", "ORVI");
        Patient patient2 = new Patient("Alex", "Alexov", "5", "Zud");
        Patient patient3 = new Patient("Yuri", "Yuriev", "8", "Kor");
        Patient patient4 = new Patient("Sasha", "Tumanov", "3", "Zud");
        Patient patient5 = new Patient("Igor", "Igorev", "7", "ORVI");

        List<Patient> patientList = List.of(patient1, patient2, patient3, patient4, patient5);
        Class<?> patientClass = Patient.class;
        List<Patient> filtredPatients = patientList.stream().filter(patient -> {
            try {
                Object object = patientClass.getMethod("get" + field).invoke(patient);
                if (object.equals(value)) {
                    return true;
                }
                return false;
            } catch (Throwable e) {
                throw new RuntimeException();
            }
        }).collect(Collectors.toList());

        return filtredPatients;
    }
}

