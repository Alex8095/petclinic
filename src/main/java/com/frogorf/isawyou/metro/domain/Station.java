/**
 * 
 */
package com.frogorf.isawyou.metro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.frogorf.domain.BaseEntity;

/** @author Tsurkin Alex
 * @version */

@Entity
@Table(name = "station")
public class Station extends BaseEntity {

	@Column
	private String name;
	@Column
	private int code;
	@Column
	private int pos;
	@ManyToOne
	@JoinColumn(name = "branch_id")
	private Branch branch;

	/* @see java.lang.Object#toString() */
	@Override
	public String toString() {
		return super.toString();
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
	public int getCode() {
		return code;
	}

	/** @param code the code to set */
	public void setCode(int code) {
		this.code = code;
	}

	/** @return the pos */
	public int getPos() {
		return pos;
	}

	/** @param pos the pos to set */
	public void setPos(int pos) {
		this.pos = pos;
	}

	/** @return the branch */
	public Branch getBranch() {
		return branch;
	}

	/** @param branch the branch to set */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
