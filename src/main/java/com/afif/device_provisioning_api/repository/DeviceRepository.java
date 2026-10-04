package com.afif.device_provisioning_api.repository;

import com.afif.device_provisioning_api.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, String> {

}