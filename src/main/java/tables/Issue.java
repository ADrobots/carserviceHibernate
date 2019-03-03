package tables;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
public class Issue {

   @Id
   @Column(name = "issue_id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer issue_id;

   @ManyToOne
   @JoinColumn(name = "car_id")
   private Car car;

   @ManyToOne
   @JoinColumn(name = "mechanic_id")
   private Mechanic mechanic;

   @Column(name = "date_open")
   private Date date_open;

   @Column(name = "date_close")
   private Date date_close;

   @Column(name = "man_hour")
   private Integer man_hour;

   @Column(name = "description")
   private String description;

   @Column(name = "price")
   private Integer price;


}
