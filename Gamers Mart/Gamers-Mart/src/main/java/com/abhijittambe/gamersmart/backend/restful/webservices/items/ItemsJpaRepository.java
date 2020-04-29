package com.abhijittambe.gamersmart.backend.restful.webservices.items;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsJpaRepository extends JpaRepository<Item, Long>{
		List<Item> findByUserName(String username);
}
