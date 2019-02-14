package com.homeAutomation.TempService.Controller;

import com.homeAutomation.TempService.Model.Temperature;
import com.homeAutomation.TempService.Service.TemperatureService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TemperatureController {
    private TemperatureService tempService = new TemperatureService();

    @RequestMapping("/")
    public Collection<Temperature> getAll(){
        return tempService.getAll();
    }

    @RequestMapping("/id/{id}")
    public Temperature getById(@PathVariable String id){
        return tempService.getById(id);
    }
}
