package com.example.userservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseDTO {


	private	UserDTO userDTO;

	private	DeptDTO deptDTO;

	public ResponseDTO(UserDTO userDTO, DeptDTO deptDTO) {
		super();
		this.userDTO = userDTO;
		this.deptDTO = deptDTO;
	}

	public ResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public DeptDTO getDeptDTO() {
		return deptDTO;
	}

	public void setDeptDTO(DeptDTO deptDTO) {
		this.deptDTO = deptDTO;
	}


}
