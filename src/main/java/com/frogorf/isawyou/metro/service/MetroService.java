/**
 * 
 */
package com.frogorf.isawyou.metro.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.frogorf.dictionary.domain.Dictionary;
import com.frogorf.dictionary.domain.DictionaryValue;
import com.frogorf.isawyou.metro.domain.Branch;
import com.frogorf.isawyou.metro.domain.Station;
import com.frogorf.isawyou.metro.domain.Transfer;

/** @author Tsurkin Alex
 * @version */
public interface MetroService {

	/* Branch */
	public List<Branch> findBranchAll();

	public Branch findBranchById(int id);

	public void saveBranch(Branch branch);

	public void deleteBranch(int id);

	/* Station */
	public List<Station> findStationAll();

	public Station findStationById(int id);

	public void saveStation(Station station);

	public void deleteStation(int id);

	/* Branch */
	public List<Transfer> findTransferAll();

	public Transfer findTransferById(int id);

	public void saveTransfer(Transfer transfer);

	public void deleteTransfer(int id);

}
