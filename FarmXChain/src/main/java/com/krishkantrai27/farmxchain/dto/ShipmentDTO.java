package com.krishkantrai27.farmxchain.dto;

import com.krishkantrai27.farmxchain.entity.ShipmentStatus;
import com.krishkantrai27.farmxchain.entity.TransportMode;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ShipmentDTO {
    private Long id;
    private Long orderId;
    private Long distributorId;
    private String distributorName;
    private String origin;
    private String destination;
    private TransportMode transportMode;
    private String currentLocation;
    private Double temperature;
    private Double humidity;
    private ShipmentStatus status;
    private LocalDateTime lastUpdated;
    private String blockchainTxHash;
    private String custodyHash;
    private List<ShipmentLogDTO> logs;
}
