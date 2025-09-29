package com.br.cardapio.foodRepository;

import com.br.cardapio.foodEntity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
