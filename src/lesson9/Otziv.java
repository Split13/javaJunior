package lesson9;

import java.util.Date;

public class Otziv {
   private int raiting;
   private String textOvOtziv;
   private Date date;

   public int getRaiting() {
      return raiting;
   }

   @Override
   public String toString() {
      return "Otziv{" +
              "raiting=" + raiting +
              ", textOvOtziv='" + textOvOtziv + '\'' +
              ", date=" + date +
              '}';
   }

   public void setRaiting(int raiting) {
      this.raiting = raiting;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public Otziv(int raiting, Date date) {
      this.raiting = raiting;
      this.date = date;
   }
}

