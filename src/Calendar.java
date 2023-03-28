import java.util.ArrayList;
import java.util.List;

public class Calendar{

  private List<HolyDay> getHolyDays() {
    List<HolyDay> holyDays = new ArrayList<>();

    holyDays.add(new HolyDay("Confraternização mundial", "01/01/2023"));
    holyDays.add(new HolyDay("Carnaval", "21/02/2023"));
    holyDays.add(new HolyDay("Páscoa", "17/04/2023"));
    holyDays.add(new HolyDay("Tiradentes", "21/04/2023"));
    holyDays.add(new HolyDay("Dia do trabalho", "01/05/2023"));
    holyDays.add(new HolyDay("Corpus Christi", "08/06/2023"));
    holyDays.add(new HolyDay("Independência do Brasil", "07/09/2023"));
    holyDays.add(new HolyDay("Nossa Senhora Aparecida", "12/10/2023"));
    holyDays.add(new HolyDay("Finados", "02/11/2023"));
    holyDays.add(new HolyDay("Proclamação da República", "15/11/2023"));
    holyDays.add(new HolyDay("Natal", "25/12/2023"));
    return holyDays;
  }

  public void verifyDate(String date) {
    List<HolyDay> holyDays = getHolyDays();
    for(int i = 0; i<holyDays.size(); i++){
      if(date == holyDays.get(i).getDate()){
        System.out.println("A data " + date + " é o feriado de " + holyDays.get(i).getName() + "!");
        return;
      }
    }
    System.out.println("A data " + date + " não é um feriado!");
    return;
  }

  public void returnAllHolyDays() {
    List<HolyDay> holyDays = getHolyDays();
    for(int i = 0; i<holyDays.size(); i++){
      System.out.println(holyDays.get(i).getDate() + " é o feriado de " + holyDays.get(i).getName() + "!");
    }
  }
}
