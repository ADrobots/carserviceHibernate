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

   public Integer getIssue_id() {
      return issue_id;
   }

   public void setIssue_id(Integer issue_id) {
      this.issue_id = issue_id;
   }

   public Car getCar() {
      return car;
   }

   public void setCar(Car car) {
      this.car = car;
   }

   public Mechanic getMechanic() {
      return mechanic;
   }

   public void setMechanic(Mechanic mechanic) {
      this.mechanic = mechanic;
   }

   public Date getDate_open() {
      return date_open;
   }

   public void setDate_open(Date date_open) {
      this.date_open = date_open;
   }

   public Date getDate_close() {
      return date_close;
   }

   public void setDate_close(Date date_close) {
      this.date_close = date_close;
   }

   public Integer getMan_hour() {
      return man_hour;
   }

   public void setMan_hour(Integer man_hour) {
      this.man_hour = man_hour;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Integer getPrice() {
      return price;
   }

   public void setPrice(Integer price) {
      this.price = price;
   }
}
