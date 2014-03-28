/**
 * 
 */
package com.frogorf.isawyou.metro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frogorf.isawyou.metro.dao.MetroDao;
import com.frogorf.isawyou.metro.domain.Branch;
import com.frogorf.isawyou.metro.domain.Station;
import com.frogorf.isawyou.metro.domain.Transfer;
import com.frogorf.isawyou.metro.service.MetroService;

/** @author Tsurkin Alex
 * @version */
@Service("metroService")
@Repository
@Transactional
public class MetroServiceImpl implements MetroService {

	@Autowired
	private MetroDao metroDao;

	/* @see com.frogorf.isawyou.metro.service.MetroService#findBranchAll() */
	@Override
	@Transactional(readOnly = true)
	public List<Branch> findBranchAll() {
		return metroDao.findBranchAll();
	}

	/* @see com.frogorf.isawyou.metro.service.MetroService#findBranchById(int) */
	@Override
	@Transactional(readOnly = true)
	public Branch findBranchById(int id) {
		return metroDao.findBranchById(id);
	}

	/* @see
	 * com.frogorf.isawyou.metro.service.MetroService#saveBranch(com.frogorf
	 * .isawyou.metro.domain.Branch) */
	@Override
	public void saveBranch(Branch branch) {
		metroDao.saveBranch(branch);
	}

	/* @see com.frogorf.isawyou.metro.service.MetroService#deleteBranch(int) */
	@Override
	@Transactional(readOnly = true)
	public void deleteBranch(int id) {
		metroDao.deleteBranch(id);
	}

	/* @see com.frogorf.isawyou.metro.service.MetroService#findStationAll() */
	@Override
	@Transactional(readOnly = true)
	public List<Station> findStationAll() {
		return metroDao.findStationAll();
	}

	/* @see com.frogorf.isawyou.metro.service.MetroService#findStationById(int) */
	@Override
	@Transactional(readOnly = true)
	public Station findStationById(int id) {
		return metroDao.findStationById(id);
	}

	/* @see
	 * com.frogorf.isawyou.metro.service.MetroService#saveStation(com.frogorf
	 * .isawyou.metro.domain.Station) */
	@Override
	public void saveStation(Station station) {
		metroDao.saveStation(station);
	}

	/* @see com.frogorf.isawyou.metro.service.MetroService#deleteStation(int) */
	@Override
	@Transactional(readOnly = true)
	public void deleteStation(int id) {
		metroDao.deleteStation(id);
	}

	/* @see com.frogorf.isawyou.metro.service.MetroService#findTransferAll() */
	@Override
	@Transactional(readOnly = true)
	public List<Transfer> findTransferAll() {
		return metroDao.findTransferAll();
	}

	/* @see com.frogorf.isawyou.metro.service.MetroService#findTransferById(int) */
	@Override
	@Transactional(readOnly = true)
	public Transfer findTransferById(int id) {
		return metroDao.findTransferById(id);
	}

	/* @see
	 * com.frogorf.isawyou.metro.service.MetroService#saveTransfer(com.frogorf
	 * .isawyou.metro.domain.Transfer) */
	@Override
	public void saveTransfer(Transfer transfer) {
		metroDao.saveTransfer(transfer);
	}

	/* @see com.frogorf.isawyou.metro.service.MetroService#deleteTransfer(int) */
	@Override
	@Transactional(readOnly = true)
	public void deleteTransfer(int id) {
		metroDao.deleteTransfer(id);
	}

}
