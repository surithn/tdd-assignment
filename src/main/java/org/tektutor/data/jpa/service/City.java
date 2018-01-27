/**
 * 
 */
package org.tektutor.data.jpa.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;

/**
 * @author kxhb130
 *
 */
@Entity
@Data
@IdClass(CityId.class)
public class City {

	@Id
	private String name;
	
	@Id
	private String country;
	private String state;
	private String map;
}
