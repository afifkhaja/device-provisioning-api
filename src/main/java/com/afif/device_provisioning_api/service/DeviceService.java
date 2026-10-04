package com.afif.device_provisioning_api.service;

import com.afif.device_provisioning_api.dto.RegisterDeviceRequest;
import com.afif.device_provisioning_api.model.Device;
import com.afif.device_provisioning_api.model.DeviceStatus;
import com.afif.device_provisioning_api.repository.DeviceRepository;
import org.springframework.stereotype.Service;

@Service 
public class DeviceService{

    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository){
        this.deviceRepository = deviceRepository;
    }

    public Device registerDevice(RegisterDeviceRequest request){

        Device device = new Device(
            request.deviceId(),
            request.deviceName(),
            DeviceStatus.REGISTERED
        );

        return deviceRepository.save(device);

    }
    
    public Device getDevice(String deviceId){
        return deviceRepository.findById(deviceId)
        .orElseThrow( () -> new RuntimeException("Device not found") );   
    }

}