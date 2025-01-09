package com.ts.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.Model.Cart;
import com.ts.Model.Product;
import com.ts.Model.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

	List<Cart> findByUser(User user);
	Optional<Cart> findByUserAndProduct(User user, Product product);
	void deleteByUser(User user);
}
