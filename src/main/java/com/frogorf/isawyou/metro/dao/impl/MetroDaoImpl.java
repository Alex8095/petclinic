/**
 * 
 */
package com.frogorf.isawyou.metro.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.frogorf.dictionary.dao.DictionaryDao;
import com.frogorf.dictionary.domain.Dictionary;
import com.frogorf.dictionary.domain.DictionaryValue;
import com.frogorf.isawyou.metro.dao.MetroDao;
import com.frogorf.isawyou.metro.domain.Branch;
import com.frogorf.isawyou.metro.domain.Station;
import com.frogorf.isawyou.metro.domain.Transfer;

/** @author Tsurkin Alex
 * @version */
@Repository("metroDao")
@Transactional
public class MetroDaoImpl implements MetroDao {

	@Autowired
	private SessionFactory sessionFactory;

	/* @see com.frogorf.isawyou.metro.dao.MetroDao#findBranchAll() */
	@Override
	public List<Branch> findBranchAll() {
		return sessionFactory.getCurrentSession().createQuery("from Branch").list();
	}

	/* @see com.frogorf.isawyou.metro.dao.MetroDao#findBranchById(int) */
	@Override
	public Branch findBranchById(int id) {
		return (Branch) sessionFactory.getCurrentSession().get(Branch.class, id);
	}

	/* @see
	 * com.frogorf.isawyou.metro.dao.MetroDao#saveBranch(com.frogorf.isawyou
	 * .metro.domain.Branch) */
	@Override
	public void saveBranch(Branch branch) {
		sessionFactory.getCurrentSession().saveOrUpdate(branch);

	}

	/* @see com.frogorf.isawyou.metro.dao.MetroDao#deleteBranch(int) */
	@Override
	public void deleteBranch(int id) {
		sessionFactory.getCurrentSession().delete(id);
	}

	/* @see com.frogorf.isawyou.metro.dao.MetroDao#findStationAll() */
	@Override
	public List<Station> findStationAll() {
		return sessionFactory.getCurrentSession().createQuery("from Station").list();
	}

	/* @see com.frogorf.isawyou.metro.dao.MetroDao#findStationById(int) */
	@Override
	public Station findStationById(int id) {
		return (Station) sessionFactory.getCurrentSession().get(Station.class, id);
	}

	/* @see
	 * com.frogorf.isawyou.metro.dao.MetroDao#saveStation(com.frogorf.isawyou
	 * .metro.domain.Station) */
	@Override
	public void saveStation(Station station) {
		sessionFactory.getCurrentSession().saveOrUpdate(station);
	}

	/* @see com.frogorf.isawyou.metro.dao.MetroDao#deleteStation(int) */
	@Override
	public void deleteStation(int id) {
		sessionFactory.getCurrentSession().delete(id);

	}

	/* @see com.frogorf.isawyou.metro.dao.MetroDao#findTransferAll() */
	@Override
	public List<Transfer> findTransferAll() {
		return sessionFactory.getCurrentSession().createQuery("from Transfer").list();
	}

	/* @see com.frogorf.isawyou.metro.dao.MetroDao#findTransferById(int) */
	@Override
	public Transfer findTransferById(int id) {
		return (Transfer) sessionFactory.getCurrentSession().get(Transfer.class, id);
	}

	/* @see
	 * com.frogorf.isawyou.metro.dao.MetroDao#saveTransfer(com.frogorf.isawyou
	 * .metro.domain.Transfer) */
	@Override
	public void saveTransfer(Transfer transfer) {
		sessionFactory.getCurrentSession().saveOrUpdate(transfer);

	}

	/* @see com.frogorf.isawyou.metro.dao.MetroDao#deleteTransfer(int) */
	@Override
	public void deleteTransfer(int id) {
		sessionFactory.getCurrentSession().delete(id);

	}
}
