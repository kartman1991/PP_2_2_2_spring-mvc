package web.service;

import java.util.ArrayList;
import java.util.List;

public class CarsService {

    public static List<String> getCarsList() {
        List<String> carsList = new ArrayList<>();
        carsList.add("VW G8");
        carsList.add("E46");
        carsList.add("W213");
        carsList.add("Giulia");
        carsList.add("Teana");
        return carsList;
    }
    public static Integer getCount(Integer count, List list) {
        if (count != null && count < list.size()) {
            return count;
        }
        return list.size();
    }
}
