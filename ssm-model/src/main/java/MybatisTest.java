
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
import com.dev.entity.Account;
import com.dev.util.SessionFactoryUtil;




public class MybatisTest {

	public static void main(String[] args) throws IOException {
		
		SqlSession ss = SessionFactoryUtil.getSqlSession();
		
		
		// 更新操作
		AccountMapper amp = ss.getMapper(AccountMapper.class);
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("userName","ma");
		Account ac = amp.like(map);
		
		System.out.println("id:→ "+ac.getId()+" name: "+ac.getUserName()+" 电话： "+ac.getTel());
		
		
		
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
