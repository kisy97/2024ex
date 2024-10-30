package com.ktest.audition.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PointDTO {
	
	private String serial_no;
	private String artist_id;
	private String mento_id;
	private Integer point;
	private String grade;
	
	private String artist_name;
	private String artist_birth;
	private String mento_name;
	private String sum_point;
	private String avg_point;
	private Integer rank;
}
