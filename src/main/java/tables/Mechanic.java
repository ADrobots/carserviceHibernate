package tables;


import javafx.scene.chart.PieChart;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mechanic")
public class Mechanic {

    @Id
    @Column(name = "mechanic_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mechanic_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "employment_date")
    private Date employment_date;

    @Column(name = "education")
    private String education;

    public Integer getMechanic_id() {
        return mechanic_id;
    }

    public void setMechanic_id(Integer mechanic_id) {
        this.mechanic_id = mechanic_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Date getEmployment_date() {
        return employment_date;
    }

    public void setEmployment_date(Date employment_date) {
        this.employment_date = employment_date;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "mechanic_id=" + mechanic_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", experience=" + experience +
                ", employment_date=" + employment_date +
                ", education='" + education + '\'' +
                '}';
    }
}
