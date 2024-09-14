package com.foodiehub.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
//@ToString
@Getter
@Setter
public class OrderDetails
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;

	private LocalDateTime orderDate;

//	@NonNull
//	@NotBlank
//	@NotEmpty
//	@Size(min = 3, max = 10, message = "Order Status should 3 to 10")
	private String orderStatus;

	@OneToOne(cascade = CascadeType.ALL)
	public FoodCart cart;

}
