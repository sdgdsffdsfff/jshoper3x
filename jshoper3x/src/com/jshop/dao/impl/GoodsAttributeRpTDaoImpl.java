package com.jshop.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.jshop.dao.GoodsAttributeRpTDao;
import com.jshop.entity.FunctionM;
import com.jshop.entity.GoodsAttributeRpT;
@Repository("goodsAttributeRpTDao")
public class GoodsAttributeRpTDaoImpl extends HibernateDaoSupport  implements GoodsAttributeRpTDao {
	private static final Logger log = LoggerFactory.getLogger(TemplatesetTDaoImpl.class);
	
	@Override
	public void saveGoodsAttributeRpT(GoodsAttributeRpT gart) {
		log.debug("save TemplatesetT");
		try {
			this.getHibernateTemplate().save(gart);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	@Override
	public List<GoodsAttributeRpT> findGoodsAttributeRpTBygoodsid(String goodsid) {
		log.debug("findGoodsAttributeRpTBygoodsid");
		try {
			String queryString = "from GoodsAttributeRpT as garpt where garpt.goodsid=:goodsid";
			List<GoodsAttributeRpT> list = this.getHibernateTemplate().findByNamedParam(queryString, "goodsid", goodsid);
			return list;
		} catch (RuntimeException re) {
			log.error("findGoodsAttributeRpTBygoodsid error", re);
			throw re;
		}
	}

	@Override
	public void delByProperty(String property, Object entity) {
		log.debug("delByProperty");
		try {
			this.getHibernateTemplate().delete(property, entity);
		} catch (RuntimeException re) {
			log.error("delByProperty error", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public int delBygoodsid(final String goodsid) {
		log.debug("delBygoodsid");
		try {

			final String queryString = "delete from GoodsAttributeRpT as grpt where grpt.goodsid=:goodsid";
			Integer integer=(Integer)this.getHibernateTemplate().execute(new HibernateCallback() {

				public Object doInHibernate(Session session) throws HibernateException, SQLException {
					Query query = session.createQuery(queryString);
					query.setParameter("goodsid", goodsid);
					return query.executeUpdate();
				}
			});
			return integer;
		} catch (RuntimeException re) {
			log.error("delFunctionM failed", re);
			throw re;
		}
	
		
	}

	

}
