package com.ktest.audition.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArtistDTO {
	private String artist_id;
	private String artist_name;
	private String artist_birth;
	private String artist_gender;
	private String talent;
	private String agency;
}
