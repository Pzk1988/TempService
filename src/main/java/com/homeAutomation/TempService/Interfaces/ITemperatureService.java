package com.homeAutomation.TempService.Interfaces;

import com.homeAutomation.TempService.Model.Temperature;
import java.util.Collection;

public interface ITemperatureService {
        public Temperature getById(String id);
        public Collection<Temperature> getAll();
}
