package com.afif.device_provisioning_api.controller;

import com.afif.device_provisioning_api.dto.RegisterDeviceRequest;
import com.afif.device_provisioning_api.model.Device;
import com.afif.device_provisioning_api.service.DeviceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/devices")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService){
        this.deviceService = deviceService;
    }

    @PostMapping 
    public Device registerDevice(@RequestBody RegisterDeviceRequest request){
        return deviceService.registerDevice(request);
    }

    @GetMapping("/{deviceId}")
    public Device getDevice(@PathVariable String deviceId){
        return deviceService.getDevice(deviceId);
    }

}