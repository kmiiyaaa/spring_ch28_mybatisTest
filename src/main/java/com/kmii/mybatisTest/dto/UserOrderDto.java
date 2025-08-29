package com.kmii.mybatisTest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserOrderDto {
	
	private String userid;
	private String username;
	private int orderid;
	private String ordername;

}
