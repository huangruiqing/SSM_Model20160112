import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dev.entity.Account;




public class MybatisTest {

	public static void main(String[] args) throws IOException {
		//1 读取配置文件mybatis.xml
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		
		//创建SqlSessionFactory 
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		// 创建SqlSession对象
		SqlSession ss = ssf.openSession();
		//数据操作
		
		Account ac = ss.selectOne("com.dev.dao.AccountMapper.findById",1); 
		
		System.out.println("name: "+ac.getUserName());
		//关闭
		ss.close();
	}
}
