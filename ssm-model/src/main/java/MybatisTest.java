import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dev.entity.Account;




public class MybatisTest {

	public static void main(String[] args) throws IOException {
		//1 ��ȡ�����ļ�mybatis.xml
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		
		//����SqlSessionFactory 
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		// ����SqlSession����
		SqlSession ss = ssf.openSession();
		//��ݲ���
		
		Account ac = ss.selectOne("com.dev.dao.AccountMapper.findById",1); 
		
		System.out.println("name: "+ac.getUserName());
		//�ر�
		ss.close();
	}
}
