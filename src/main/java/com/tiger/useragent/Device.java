package com.tiger.useragent;

import static com.tiger.useragent.Constant.DEFAULT_VALUE;

/**
 * com.tiger.useragent
 * author : zhaolihe
 * email : dayingzhaolihe@126.com
 * date : 2017/5/9
 */
public class Device {
    static final Device DEFAULT_PC_SCREEN = new Device("PC", DEFAULT_VALUE, DeviceType.PC, false, DEFAULT_VALUE);
    static final Device DEFAULT_PHONE_SCREEN = new Device(DEFAULT_VALUE, DEFAULT_VALUE, DeviceType.Phone, true, DEFAULT_VALUE);
    static final Device DEFAULT_TV = new Device(DEFAULT_VALUE, DEFAULT_VALUE, DeviceType.TV, false, DEFAULT_VALUE);

    final String brand;
    final String family;
    final DeviceType deviceType;
    final boolean isMobile;
    final String screenSize;

    Device(String brand, String family, DeviceType deviceType, boolean isMobile) {
        this.brand = brand;
        this.family = family;
        this.deviceType = deviceType;
        this.isMobile = isMobile;
        this.screenSize = "";
    }

    Device(String brand, String family, DeviceType deviceType, boolean isMobile, String screenSize) {
        this.brand = brand;
        this.family = family;
        this.deviceType = deviceType;
        this.isMobile = isMobile;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getFamily() {
        return family;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public boolean isMobile() {
        return isMobile;
    }

    public String getScreenSize() {
        return screenSize;
    }
}
