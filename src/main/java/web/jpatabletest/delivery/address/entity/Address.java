package web.jpatabletest.delivery.address.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter @Builder
@NoArgsConstructor @AllArgsConstructor
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
