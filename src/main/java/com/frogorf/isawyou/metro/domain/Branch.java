/**
 * 
 */
package com.frogorf.isawyou.metro.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.frogorf.dictionary.domain.DictionaryValue;
import com.frogorf.domain.BaseEntity;

/** @author Tsurkin Alex
 * @version */

@Entity
@Table(name = "branch")
public class Branch extends BaseEntity {

	@Column
	private String color;
	@Column
	private String name;
	@Column
	private String code;
	@OneToMany(mappedBy = "branch", fetch = FetchType.EAGER)
	private List<Station> stations;
	@OneToMany(mappedBy = "branch", fetch = FetchType.EAGER)
	private List<Transfer> transfers;

	public Branch() {
	}

	/* @see java.lang.Object#toString() */
	@Override
	public String toString() {
		return super.toString();
	}

	/** @return the color */
	public String getColor() {
		return color;
	}

	/** @param color the color to set */
	public void setColor(String color) {
		this.color = color;
	}

	/** @return the name */
	public String getName() {
		return name;
	}

	/** @param name the name to set */
	public void setName(String name) {
		this.name = name;
	}

	/** @return the code */
	public String getCode() {
		return code;
	}

	/** @param code the code to set */
	public void setCode(String code) {
		this.code = code;
	}

	/** @return the stations */
	public List<Station> getStations() {
		if (this.stations == null)
			this.stations = new ArrayList<Station>();
		return stations;
	}

	/** @param stations the stations to set */
	public void setStations(List<Station> stations) {
		this.stations = stations;
	}

	/** @return the transfers */
	public List<Transfer> getTransfers() {
		if (this.transfers == null)
			this.transfers = new ArrayList<Transfer>();
		return transfers;
	}

	/** @param transfers the transfers to set */
	public void setTransfers(List<Transfer> transfers) {
		this.transfers = transfers;
	}

}
