/**
 * 
 */
package com.frogorf.isawyou.metro.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.frogorf.domain.BaseEntity;

/** @author Tsurkin Alex
 * @version */
@Entity
@Table(name = "transfer")
public class Transfer extends BaseEntity {

	@OneToOne
	private Branch branch;
	@OneToOne
	private Station station;
	@OneToOne
	@JoinColumn(name = "transfer_to_id")
	private Transfer transferTo;

	/* @see java.lang.Object#toString() */
	@Override
	public String toString() {
		return super.toString();
	}

	/** @return the branch */
	public Branch getBranch() {
		return branch;
	}

	/** @param branch the branch to set */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	/** @return the station */
	public Station getStation() {
		return station;
	}

	/** @param station the station to set */
	public void setStation(Station station) {
		this.station = station;
	}

	/** @return the transferTo */
	public Transfer getTransferTo() {
		return transferTo;
	}

	/** @param transferTo the transferTo to set */
	public void setTransferTo(Transfer transferTo) {
		this.transferTo = transferTo;
	}

}
