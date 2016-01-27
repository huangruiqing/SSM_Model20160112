import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.dao.AccountDao;
import com.dev.entity.Account;
import com.dev.service.AccountService;
import org.springframework.web.context.ContextLoaderListener;;


public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AccountService as = (AccountService) context.getBean("accountService");
		Account ac = as.findById(1l);
		System.out.println(ac.getAddress());
		
		
		/*AccountService as = (AccountService) context.getBean("accountService");
		
		as.save();
		*/
		
		/*AccountDao ad = (AccountDao) context.getBean("accountDao");
		
		ad.save();*/
		/*
		Account account = context.getBean(Account.class);
		Account account2 = context.getBean(Account.class);
		
		System.out.println(account == account2);
		*/
		
	}
	
	
	
	
	
	
}
