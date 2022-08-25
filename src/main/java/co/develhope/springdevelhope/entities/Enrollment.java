package co.develhope.springdevelhope.entities;

import javax.persistence.*;

@Table
@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private SchoolClass schoolClass;
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Enrollment() {
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", schoolClass=" + schoolClass +
                ", student=" + student +
                '}';
    }
}