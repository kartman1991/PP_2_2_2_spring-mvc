package web.service;

import java.util.ArrayList;
import java.util.List;

public class CarsService implements CarService {

    List<String> carsList = new ArrayList<>();

    public List<String> getCarsList() {
        carsList.add("VW G8");
        carsList.add("E46");
        carsList.add("W213");
        carsList.add("Giulia");
        carsList.add("Teana");
        return carsList;
    }
    public Integer getCount(Integer count) {
        if (count != null && count < carsList.size()) {
            return count;
        }
        return carsList.size();
    }
}
