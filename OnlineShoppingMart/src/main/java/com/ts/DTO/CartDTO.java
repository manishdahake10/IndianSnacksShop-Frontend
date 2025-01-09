package com.ts.DTO;

import java.time.LocalDateTime;

public class CartDTO {

	private Long cartId;
	private Long userId;
	private Long productId;
	private Integer quntity;
	private LocalDateTime addedAt;
	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Integer getQuntity() {
		return quntity;
	}
	public void setQuntity(Integer quntity) {
		this.quntity = quntity;
	}
	public LocalDateTime getAddedAt() {
		return addedAt;
	}
	public void setAddedAt(LocalDateTime addedAt) {
		this.addedAt = addedAt;
	}
	
	public CartDTO() {}
	public CartDTO(Long cartId, Long userId, Long productId, Integer quntity, LocalDateTime addedAt) {
		
		this.cartId = cartId;
		this.userId = userId;
		this.productId = productId;
		this.quntity = quntity;
		this.addedAt = addedAt;
	}
	
}
