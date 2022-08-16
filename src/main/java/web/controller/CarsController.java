package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xml.internal.serializer.utils.Utils.messages;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        List<String> carsList = new ArrayList<>();
        carsList.add("VW G8");
        carsList.add("E46");
        carsList.add("W213");
        carsList.add("Giulia");
        carsList.add("Teana");
        System.out.println(count);
        if (count != null && count <= carsList.size()) {
            while (carsList.size() != count) {
                carsList.remove(carsList.size() - 1);
            }
        }

        model.addAttribute("carlist", carsList);
        return "cars";
    }
}
