package web.jpatabletest.item.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;

@Entity @Getter
@DiscriminatorValue("B")
public class Book extends Item{

    private String author;
    private String isbn;
}
