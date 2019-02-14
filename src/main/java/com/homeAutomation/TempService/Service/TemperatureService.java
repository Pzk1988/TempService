package com.homeAutomation.TempService.Service;

import com.homeAutomation.TempService.Model.Temperature;

import java.util.ArrayList;
import java.util.Collection;

public class TemperatureService {
    private Collection<Temperature> tempCollection;

    public TemperatureService(){
        tempCollection = new ArrayList();
        tempCollection.add( new Temperature("28-000005bbdcec", 2243));
        tempCollection.add( new Temperature("28-000005bbe0e6", -232));
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
