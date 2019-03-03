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
}
