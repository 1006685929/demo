package com.dao;

import com.pojo.SensorData;

import java.util.List;

public interface SensorDao {

    SensorData getData(int id);

    List<SensorData> showAll();
}
