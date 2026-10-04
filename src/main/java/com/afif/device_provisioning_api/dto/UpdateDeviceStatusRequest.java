package com.afif.device_provisioning_api.dto;

import com.afif.device_provisioning_api.model.DeviceStatus;

public record UpdateDeviceStatusRequest(
    DeviceStatus status
){

}