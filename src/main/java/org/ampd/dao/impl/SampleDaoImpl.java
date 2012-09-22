package org.ampd.dao.impl;

import org.ampd.dao.SampleDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class SampleDaoImpl implements SampleDao {
 
  @Autowired
  SessionFactory sessionFactory;

public String getDummy() {
	return "dummy";
}
}
