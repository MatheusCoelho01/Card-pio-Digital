package com.br.cardapio.foodEntity;

import com.br.cardapio.foodDTO.foodRequestDTO.FoodRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "foods")
@Entity(name = "foods")
@EqualsAndHashCode(of = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;

    public Food() {
    }

    public Food(Long id, String title, String image, Integer price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
    }

    public Food(FoodRequestDTO data) {
        this.image = data.image();;
        this.price = data.price();
        this.title = data.title();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
