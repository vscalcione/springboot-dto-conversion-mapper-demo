package it.vscalcione.springboot.demoapplication.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
	private Long id;
	private String email;
	private String place;
	private double longitude;
	private double latitude;
}
