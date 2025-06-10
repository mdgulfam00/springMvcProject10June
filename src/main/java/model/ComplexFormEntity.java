package model;

import java.util.Date;
import java.util.List;

public class ComplexFormEntity {
    private String name;
    private Long id;
    private Date dob;
    private List<String> courses;
    private String gender;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Date getDob() {
        return dob;
    }

    public Long getId() {
        return id;
    }

    public List<String> getCourses() {
        return courses;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ComplexFormEntity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                ", courses=" + courses +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
