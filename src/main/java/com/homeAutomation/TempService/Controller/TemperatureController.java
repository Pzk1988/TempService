package com.homeAutomation.TempService.Controller;

import com.homeAutomation.TempService.Interfaces.ITemperatureService;
import com.homeAutomation.TempService.Model.Temperature;
import com.homeAutomation.TempService.Service.Ds18B20Service;
import com.homeAutomation.TempService.Service.StaticTemperatureService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TemperatureController {
    private ITemperatureService tempService = new Ds18B20Service();

    @RequestMapping("/")
    public Collection<Temperature> getAll(){
        return tempService.getAll();
    }

    @RequestMapping("/id/{id}")
    public Temperature getById(@PathVariable String id){
        return tempService.getById(id);
    }
}
