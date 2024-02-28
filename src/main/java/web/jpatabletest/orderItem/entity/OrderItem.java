package web.jpatabletest.orderItem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import web.jpatabletest.item.entity.Item;
import web.jpatabletest.order.entity.Order;

@Entity
@Getter @Builder
@NoArgsConstructor @AllArgsConstructor
@Table(name = "ORDER_ITEM")
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITME_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID ")
    private Order order;

    private int orderPrice;
    private int count;


}
