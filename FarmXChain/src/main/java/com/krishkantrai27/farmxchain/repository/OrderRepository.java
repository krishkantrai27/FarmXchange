package com.krishkantrai27.farmxchain.repository;

import com.krishkantrai27.farmxchain.entity.Order;
import com.krishkantrai27.farmxchain.entity.OrderStatus;
import com.krishkantrai27.farmxchain.entity.User;
import com.krishkantrai27.farmxchain.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByBuyer(User buyer);
    List<Order> findByFarmer(Farmer farmer);
    List<Order> findByDistributor(User distributor);
    List<Order> findByDistributorAndStatus(User distributor, OrderStatus status);
}
