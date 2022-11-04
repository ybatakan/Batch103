package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz

        LocalTime jpn = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime alm = LocalTime.now(ZoneId.of("Europe/Berlin"));
        Long fark = ChronoUnit.HOURS.between(alm,jpn);
        System.out.println(fark);


        //Example 2: Sabit bir tarih olusturunuz

        LocalDate date= LocalDate.of(2011, Month.DECEMBER,13);
        System.out.println(date);


         /*
              Java'da sabit datalari(Gun isimler, Ay isimleri, Amerika'daki eyalet isimleri etc.) depolamak ve gerektiginde kullanmak icin depolar
              olustururuz. Bu depolara "Enum" denir.
         */
        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"
    }
}
