package com.service.impl;

import com.dao.SensorDao;
import com.pojo.SensorData;
import com.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Serviceimpl implements DataService{

    @Autowired
    private SensorDao sensorDao;
    @Override
    public SensorData getData(int id) {
        return sensorDao.getData(id);
    }

    @Override
    public List<SensorData> showAll() {
        return sensorDao.showAll();
    }
}
