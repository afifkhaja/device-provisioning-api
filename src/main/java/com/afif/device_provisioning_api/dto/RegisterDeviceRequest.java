package com.afif.device_provisioning_api.dto;

public record RegisterDeviceRequest(
    String deviceId,
    String deviceName
) {

}