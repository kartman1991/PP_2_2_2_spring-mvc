package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xml.internal.serializer.utils.Utils.messages;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count,
                          Model model, CarsService carsService){
        model.addAttribute("carlist", carsService.getCarsList());
        model.addAttribute("count", carsService.getCount(count));
        return "cars";
    }
}
