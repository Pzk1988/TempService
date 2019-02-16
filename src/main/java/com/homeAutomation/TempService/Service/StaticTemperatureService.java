package com.homeAutomation.TempService.Service;

import com.homeAutomation.TempService.Interfaces.ITemperatureService;
import com.homeAutomation.TempService.Model.Temperature;

import java.util.ArrayList;
import java.util.Collection;

public class StaticTemperatureService implements ITemperatureService{
    private Collection<Temperature> tempCollection;

    public StaticTemperatureService(){
        tempCollection = new ArrayList();
        tempCollection.add( new Temperature("28-000005bbdcec", 22.43));
        tempCollection.add( new Temperature("28-000005bbe0e6", -2.32));
    }

    public Temperature getById(String id){
        return tempCollection .stream()
                              .filter( t -> t.getId().equals(id))
                              .findFirst()
                              .get();
    }

    public Collection<Temperature> getAll(){
        return tempCollection;
    }
}
