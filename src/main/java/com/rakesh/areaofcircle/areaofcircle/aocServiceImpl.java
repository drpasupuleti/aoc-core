package com.rakesh.areaofcircle.areaofcircle;

import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.text.DecimalFormat;

@Service
public class aocServiceImpl implements aocService {


    @Override
    public String calculateAOC(double radius) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(Math.PI * (radius * radius));
    }
}
