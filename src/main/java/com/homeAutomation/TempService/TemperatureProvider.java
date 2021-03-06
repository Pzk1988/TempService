package com.homeAutomation.TempService;

import com.homeAutomation.TempService.Model.Temperature;
import com.pi4j.component.temperature.TemperatureSensor;
import com.pi4j.component.temperature.impl.TmpDS18B20DeviceType;
import com.pi4j.io.w1.W1Device;
import com.pi4j.io.w1.W1Master;

import java.util.*;

public class TemperatureProvider implements Runnable {
    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
                System.out.println("Background thread");
            }catch (InterruptedException e){

            }
        }
    }

    private Temperature getById(String id) {
        W1Master master = new W1Master();
        List<W1Device> devices = master.getDevices(TmpDS18B20DeviceType.FAMILY_CODE);

        Optional<W1Device> device = devices.stream().filter(d -> d.getName().equals(id)).findFirst();
        if(device.isPresent()){
            TemperatureSensor tempDev = (TemperatureSensor)device.get();
            return new Temperature(tempDev.getName(), tempDev.getTemperature());
        }
        return null;
    }

    private Collection<Temperature> getAll() {
        Collection<Temperature> tempList = new ArrayList();

        W1Master master = new W1Master();
        List<W1Device> devices = master.getDevices(TmpDS18B20DeviceType.FAMILY_CODE);
        for (W1Device device : devices) {
            TemperatureSensor tempDev = (TemperatureSensor)device;
            tempList.add(new Temperature(tempDev.getName(), tempDev.getTemperature()));
        }
        return tempList;
    }
}
