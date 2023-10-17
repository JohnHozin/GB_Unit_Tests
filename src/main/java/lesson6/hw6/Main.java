package lesson6.hw6;

import java.util.List;

public class Main {

    public String compareLists(List<Integer> list1, List<Integer> list2) {
        if (list1.size() == 0 || list2.size() == 0) {
            return "Список пуст";
        }
        double average1 = averageList(list1);
        double average2 = averageList(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    public double averageList(List<Integer> list) {
        if (list.size() == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i : list) {
            sum += i;
        }
        return sum / list.size();
    }
}
