package web.jpatabletest.delivery.entity;

import jakarta.persistence.*;
import web.jpatabletest.delivery.address.entity.Address;
import web.jpatabletest.order.entity.Order;

@Entity
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliverStatus status;
}
