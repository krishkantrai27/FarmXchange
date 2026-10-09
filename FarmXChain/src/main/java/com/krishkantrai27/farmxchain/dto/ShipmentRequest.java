package com.krishkantrai27.farmxchain.dto;

import com.krishkantrai27.farmxchain.entity.TransportMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShipmentRequest {
    private Long orderId;
    private String origin;
    private String destination;
    private TransportMode transportMode;
}
