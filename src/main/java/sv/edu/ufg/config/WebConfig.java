package sv.edu.ufg.config;
 
import java.util.Properties;

//import javax.naming.Context;
//import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
 
@EnableWebMvc
@Configuration
@ComponentScan({ "sv.edu.ufg.*" })
@EnableTransactionManagement
@Import({SecurityConfig.class})
public class WebConfig extends WebMvcConfigurerAdapter {
 
  
   private String driverClassName="oracle.jdbc.driver.OracleDriver" ;
 	private String userName="clinica";
 	private String password="$$Asi2Clinica"; 
 	private String url="jdbc:oracle:thin:@oradev.chztjhzcptcm.us-west-2.rds.amazonaws.com:1521:orcl";
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	
	@Bean
	public DataSource dataSource() throws Exception {
     
     	BasicDataSource basicDataSource = new BasicDataSource();
      
     	basicDataSource.setDriverClassName(driverClassName);
  		basicDataSource.setPassword(password);
  		basicDataSource.setUsername(userName);
  		basicDataSource.setUrl(url);
  		//basicDataSource.setMaxActive(MAX_ACTIVE);
     
		//Context ctx = new InitialContext();
		return basicDataSource; //(DataSource) ctx.lookup("jdbc/asi2");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
 
	
	private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", 	"org.hibernate.dialect.OracleDialect");
        properties.put("hibernate.show_sql", 	true);
        return properties;        
    }
	
	
	//@Autowired
	/*
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    sessionBuilder.scanPackages(new String[] { "sv.edu.ufg.model" });
	    
	    return sessionBuilder.buildSessionFactory();
	}
	*/
	
	
 	@Bean(name = "sessionFactory")
    public LocalSessionFactoryBean localSessionFactoryBean() throws Exception {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] { "sv.edu.ufg.model" });
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
     }
     
     
	
 	 @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }
}