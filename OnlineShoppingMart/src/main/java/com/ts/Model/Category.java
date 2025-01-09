package com.ts.Model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="product_categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	
	private String categeoryName;
	
	private String discription;
	
	@ManyToOne
	@JoinColumn(name = "parent_category_id")
	private Category parentCategory;
	
	@OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL)
	private List<Category> subCategories;
	
	@Column(nullable = false, updatable = false)
	private LocalDateTime createAt;
	
	private LocalDateTime updatable;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategeoryName() {
		return categeoryName;
	}

	public void setCategeoryName(String categeoryName) {
		this.categeoryName = categeoryName;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public List<Category> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<Category> subCategories) {
		this.subCategories = subCategories;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getUpdatable() {
		return updatable;
	}

	public void setUpdatable(LocalDateTime updatable) {
		this.updatable = updatable;
	}

	public Category() {}
	public Category(Long categoryId, String categeoryName, String discription, Category parentCategory,
			List<Category> subCategories, LocalDateTime createAt, LocalDateTime updatable) {
	
		this.categoryId = categoryId;
		this.categeoryName = categeoryName;
		this.discription = discription;
		this.parentCategory = parentCategory;
		this.subCategories = subCategories;
		this.createAt = createAt;
		this.updatable = updatable;
	}
}
