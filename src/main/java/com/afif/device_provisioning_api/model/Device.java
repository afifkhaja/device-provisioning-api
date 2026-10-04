package com.afif.device_provisioning_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Device{

    @Id
    private String deviceId;

    private String deviceName;

    @Enumerated(EnumType.STRING)
    private DeviceStatus status;

    public Device(){
        
    }

    public Device(String deviceId, String deviceName, DeviceStatus status){
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = status;
    }

    public String getDeviceId(){
        return deviceId;
    }

    public void setDeviceId(String deviceId){
        this.deviceId = deviceId;
    }

    public String getDeviceName(){
        return deviceName;
    }

    public void setDeviceName(String deviceName){
        this.deviceName = deviceName;
    }
    public DeviceStatus getStatus(){
        return status;
    }

    public void setStatus(DeviceStatus status){
        this.status = status;
    }

}