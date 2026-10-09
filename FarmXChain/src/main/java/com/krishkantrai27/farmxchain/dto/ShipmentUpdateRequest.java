package com.krishkantrai27.farmxchain.dto;

import com.krishkantrai27.farmxchain.entity.ShipmentStatus;
import lombok.Data;

@Data
public class ShipmentUpdateRequest {
    private String location;
    private Double temperature;
    private Double humidity;
    private ShipmentStatus status;
}
