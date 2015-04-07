package jp.co.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;


/**
 *
 * @author yoshida
 * sqlSessionFactory か sqlSessionTemplate プロパティのセットが必要なようだ
 */

@Repository
public class OrderDao extends SqlSessionDaoSupport implements Dao<Order> {

	@Override
	public Order create(Order order) {
		// TODO 自動生成されたメソッド・スタブ
		//第一引数：order.xmlのnamespace + id
		getSqlSession().insert("Order.create", order);

        return order;
	}

}

