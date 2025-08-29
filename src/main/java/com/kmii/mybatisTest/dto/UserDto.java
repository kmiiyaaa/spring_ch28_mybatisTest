package com.kmii.mybatisTest.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private String userid;
	private String username;
	private int orderid;
	
	//private List<OrderDto> orderDtos; 
	// 한아이디가 여러개 살 수 있으므로 1대다관계, 그래서 list로 넣어준다.
	// 저번에 게시글은 1:1관계여서 그냥 dto그대로 넣어준것.

}
