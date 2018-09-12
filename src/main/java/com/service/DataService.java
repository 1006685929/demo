package com.service;

import com.pojo.SensorData;

import java.util.List;

public interface DataService {

    SensorData getData(int id);

    List<SensorData> showAll();
}
