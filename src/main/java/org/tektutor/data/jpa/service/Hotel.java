/**
 * 
 */
package org.tektutor.data.jpa.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author kxhb130
 *
 */
@Entity
@Data
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long city_id;
	private String name;
	private String address;
	private String zip;
	
}
