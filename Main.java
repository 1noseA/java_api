import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    // // LocalDateTimeの生成方法
    // LocalDateTime l1 = LocalDateTime.now();
    // LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
    
    // // LocalDateTimeとZonedDateTimeの相互変換
    // ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
    // LocalDateTime l3 = z1.toLocalDateTime();

    // 文字列からLocalDateを生成
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyy/MM/dd");
    LocalDate ldate = LocalDate.parse("2020/09/22", fmt);

    // 1000日後を計算する
    LocalDate ldatep = ldate.plusDays(1000);
    String str = ldatep.format(fmt);
    System.out.println("1000日後は" + str);

    // 現在時刻との比較
    LocalDate now = LocalDate.now();
    if (now.isAfter(ldatep)) {
      System.out.println("1000日後は過去日付です");
    }
  }
}