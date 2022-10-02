package co.develhope.springdevelhope.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name, inventor;
    private LocalDate firstAppearance;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(Long id, String name, String inventor, LocalDate firstAppearance) {
        this.id = id;
        this.name = name;
        this.inventor = inventor;
        this.firstAppearance = firstAppearance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public LocalDate getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(LocalDate firstAppearance) {
        this.firstAppearance = firstAppearance;
    }
}
