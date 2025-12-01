package edu.uc.cs3003.medava;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Transporter {

    public Transporter(String transporterName, double lowTemp, double highTemp) {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    private String mTransporterName;

    public String getTransporterName() {
        return mTransporterName;
    }

    private List<Shippable> goods;
    {
        goods = new ArrayList<Shippable>();
    }

    public void ship() {
        // Do some shipping!
    }

    private double mLowTemperature, mHighTemperature;

    public Shippable unload() {
        return goods.remove(0);
    }

    public boolean load(Shippable itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            return goods.add(itemToLoad);
        }
        return false;
    }

    public boolean isEmpty() {
        return goods.isEmpty();
    }
}