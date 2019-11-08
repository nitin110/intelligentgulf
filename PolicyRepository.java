package com.unikove.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unikove.model.PcVehicle;

public interface PolicyRepository extends JpaRepository<PcVehicle, String> {
}
