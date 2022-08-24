package web.service;

import java.util.ArrayList;
import java.util.List;

public class CarsService implements CarService {
    List<String> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add("VW G8");
        carsList.add("E46");
        carsList.add("W213");
        carsList.add("Giulia");
        carsList.add("Teana");
    }

    public List<String> getCarsList() {
        return carsList;
    }
    public Integer getCount(Integer count) {
        if (count != null && count < carsList.size()) {
            return count;
        }
        return carsList.size();
    }
}
