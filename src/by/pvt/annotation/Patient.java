package by.pvt.annotation;

public class Patient {
    private String name;
    private String surname;
    private String ward;
    private String diagnose;

    public Patient(String name, String surname, String ward, String diagnose) {
        this.name = name;
        this.surname = surname;
        this.ward = ward;
        this.diagnose = diagnose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ward='" + ward + '\'' +
                ", diagnose='" + diagnose + '\'' +
                '}';
    }
}
