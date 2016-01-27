
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dev.dao.AccountMapper;
import com.dev.dao.ProductMapper;
import com.dev.dao.ProductTypeMapper;
import com.dev.entity.Account;
import com.dev.entity.Product;
import com.dev.entity.ProductType;
import com.dev.util.SessionFactoryUtil;




public class MybatisTest {

	public static void main(String[] args) throws IOException {
		
		SqlSession ss = SessionFactoryUtil.getSqlSession(true);
		
		
		// 更新操作
		
		ProductTypeMapper ptm = ss.getMapper(ProductTypeMapper.class);
		ProductType pt =  ptm.findByTypeWithProduct(2L);
		System.out.println("id: "+pt.getId()+" name: "+pt.getName());
		System.out.println("-------------------------------------");
		System.out.println(pt.getProductList().size());
		for(Product p : pt.getProductList()){
			System.out.println("name11: "+p.getName());
		}
		
		
		
		/*ProductMapper pdm = ss.getMapper(ProductMapper.class);
		
		List<Product> productList = pdm.findProductWithType();
		for(Product prod : productList){
			
			System.out.println("id: "+prod.getId()+" name: "+prod.getName()+" tid: "+prod.getTid()+" ptid: "+prod.getProductType().getId()+" ptname: "+prod.getProductType().getName());
			
		}*/
		
		
		
		
		/*Product prod = pdm.findById(1L);
		System.out.println(prod);*/
		
/*		AccountMapper amp = ss.getMapper(AccountMapper.class);
		Map<String,String> map = new HashMap<String,String>();
		Account ac = new Account();
		ac.setUserName("huang");
		ac.setPassword("123456");
		ac.setTel("18236882619");
		ac.setAddress("西安");
		amp.save(ac);
		System.out.println("id: "+ac.getId());
		
		
		
		map.put("userName","ma");
		Account ac = amp.like(map);
		
		System.out.println("id:→ "+ac.getId()+" name: "+ac.getUserName()+" 电话： "+ac.getTel());*/
		
		
		
		/*List<Account> accountList = amp.findAll();
		
		for(Account ac : accountList) {
			System.out.println("id:→ "+ac.getId()+" name: "+ac.getUserName()+" 电话： "+ac.getTel());
		}*/
		
		
		
		/*Account ac = amp.findById(1L);
		ac.setAddress("中国陕西西安雁塔区锦业路都市之门");
		amp.update(ac);*/
		
	/*	//1 ��ȡ�����ļ�mybatis.xml
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		
		//����SqlSessionFactory 
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		// ����SqlSession����
		SqlSession ss = ssf.openSession();
		//��ݲ���
		
		//Account ac = ss.selectOne("com.dev.dao.AccountMapper.findById",1l); 
		AccountMapper amp = ss.getMapper(AccountMapper.class);
		Account ac = amp.findById(1L);
		
		System.out.println("id:→ "+ac.getId() +", name: "+ac.getUserName());
		//�ر�
*/		ss.close();
	}
}
