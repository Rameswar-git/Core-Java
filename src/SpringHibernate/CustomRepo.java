package SpringHibernate;


/*
 * this class demonstarates from oracle we can get sys_refcussor as output to out application 
 * 
 * the procedure in oracl should is like below
 * create or replace PROCEDURE STD 
(
  STD_DATA IN STD_ARRAY
, EMP_DATA OUT SYS_REFCURSOR 
) AS 
total NUMBER;
BEGIN
   total := STD_DATA.count; 
   FOR i in 1 .. total LOOP 
 INSERT INTO STUDENTS (fname,ispassed,SEC) VALUES (STD_DATA(i).FNAME,STD_DATA(i).ISPASSED,STD_DATA(i).SEC);
   END LOOP;
  
      OPEN EMP_DATA FOR
        SELECT *
        FROM employee
        WHERE employee.dno = STD_DATA(1).sec;
  
END STD;
 *
 */


import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.ParameterMode;
//import javax.persistence.StoredProcedureQuery;
import javax.sql.DataSource;

//import org.hibernate.Session;
//import org.hibernate.internal.SessionImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jdbc.support.oracle.SqlArrayValue;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.core.simple.SimpleJdbcCall;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.programmer.gate.model.Employee;
//import com.programmer.gate.model.student;
//
//import oracle.jdbc.OracleConnection;
//import oracle.jdbc.OracleTypes;
//import oracle.sql.ARRAY;
//import oracle.sql.ArrayDescriptor;
//import oracle.sql.STRUCT;
//import oracle.sql.StructDescriptor;

//@Repository
public class CustomRepo {
	
//	@Autowired
//	private EntityManagerFactory entityManagerFactory;
//	
//	@Autowired
//	DataSource datasor;
	
	
//	public List<Employee> getemps(String ssn) throws SQLException{
//		student std=new student();
//		std.setSql_type("STUDENT");
//		std.setFname("Sam");
//		std.setIspassed(false);
//		std.setSec(Integer.parseInt(ssn));
		
//		Session sesss =(Session) manager.getEntityManagerFactory().createEntityManager().unwrap(Session.class);
//		ProcedureCall createStoredProcedureCall = sesss.createStoredProcedureCall("STD",Employee.class);
//		createStoredProcedureCall.registerParameter("EMP_DATA",Employee.class,ParameterMode.REF_CURSOR);
//		createStoredProcedureCall.registerStoredProcedureParameter("STD_DATA",student.class,ParameterMode.IN);
//		createStoredProcedureCall.setParameter("STD_DATA", std);
//		System.out.println("Execcte .............."+createStoredProcedureCall.execute());
//		Set<Parameter<?>> parameters = createStoredProcedureCall.getParameters();
//		
//		for (Parameter<?> parameter : parameters) {
//			System.out.println(parameter.getName());
//			System.out.println(parameter.getParameterType().getPackage());
//			System.out.println(parameter.getParameterType().getPackage());
//		}

//		StoredProcedureQuery query = manager.createStoredProcedureQuery("STD",Employee.class);
//		query.registerStoredProcedureParameter("EMP_DATA",Void.class,ParameterMode.REF_CURSOR);
//		query.registerStoredProcedureParameter("STD_DATA",ARRAY.class,ParameterMode.IN);
//		Session sesss =(Session) manager.getEntityManagerFactory().createEntityManager().unwrap(Session.class);
//		SessionImpl conn = (org.hibernate.internal.SessionImpl) sesss.getDelegate();
//		OracleConnection oracon = conn.connection().unwrap(OracleConnection.class);
//      ArrayDescriptor arrayDescriptor = new ArrayDescriptor("STD_ARRAY", oracon);
//      ARRAY array = new ARRAY(arrayDescriptor, oracon, new student[] {std});
		
//		query.setParameter("STD_DATA", array);
		
//		List<Employee> resultList = (List<Employee>)query.getResultList();
//		System.out.println(query.execute());

		
		
//		Struct structProject1 = conn.createStruct("PROJECT_TYPE", project1);
//	     Struct structProject2 = conn.createStruct("PROJECT_TYPE", project2);

//	      Struct[] structArrayOfProjects = {structProject1, structProject2};

	      // array holding two ProjectType objects
//	      Array arrayOfProjects = conn.createOracleArray("MY_ARRAY", structArrayOfProjects);
		
		//new SqlParameter("EMP_DATA", OracleTypes.CURSOR)
		

		
//		manager.getTransaction().begin();
		
//		query.execute();
//		@SuppressWarnings("unchecked")
//		List<Employee> resultList = (List<Employee>)query.getResultList();
		
//		System.out.println(query.execute());
//		manager.getTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Spring Simple Jdbc call
		 * 
		 */
		
//		SimpleJdbcCall addSqlActorCall=new SimpleJdbcCall(datasor).withProcedureName("STD");
//		addSqlActorCall.declareParameters(new SqlParameter("STD_DATA", OracleTypes.ARRAY, "STD_ARRAY"));
//		BeanPropertyRowMapper sc=new BeanPropertyRowMapper();
//		addSqlActorCall.returningResultSet("EMP_DATA", sc.newInstance(Employee.class));
//		Session sesss =(Session) manager.getEntityManagerFactory().createEntityManager().unwrap(Session.class);
//		SessionImpl conn = (org.hibernate.internal.SessionImpl) sesss.getDelegate();
//		OracleConnection oracon = conn.connection().unwrap(OracleConnection.class);
//        ArrayDescriptor arrayDescriptor = new ArrayDescriptor("STD_ARRAY", oracon);
//        ARRAY array = new ARRAY(arrayDescriptor, oracon, new student[] {std});
//		Map in = Collections.singletonMap("STD_DATA", array);
//        Map execute = addSqlActorCall.execute(in);
//        System.out.println(execute.toString());
		
		/*
		 * plain Jdbc call
		 * 
		 */
		
//		Session sesss =(Session) manager.getEntityManagerFactory().createEntityManager().unwrap(Session.class);
//		SessionImpl conn = (org.hibernate.internal.SessionImpl) sesss.getDelegate();
//		Connection connection = conn.connection();
//		CallableStatement prepareCall = connection.prepareCall("{call STD(?,?)}");
//		prepareCall.registerOutParameter(2, OracleTypes.CURSOR);
//		OracleConnection oracon = connection.unwrap(OracleConnection.class);
//		StructDescriptor structDescriptor = StructDescriptor.createDescriptor("STUDENT",oracon);
//		Object[] attributes = {"Ram", 1,4};
//		STRUCT struct = new STRUCT(structDescriptor, oracon, attributes);
//		prepareCall.setObject(1, struct,OracleTypes.JAVA_STRUCT);
//		ResultSet executeQuery = prepareCall.executeQuery(); 
//		System.out.println("++++++++++++"+executeQuery.getFetchSize());

//		return null;
//	}
	
//	@Transactional(rollbackFor = Exception.class)
//	public void storedata(int entries,int startno,int minlength,int maxlength,String character){
//		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
//		StoredProcedureQuery query = createEntityManager.createStoredProcedureQuery("TESTINSERT");
//		query.registerStoredProcedureParameter("COUNTNO",Integer.class,ParameterMode.IN);
//		query.registerStoredProcedureParameter("STARTNO",Integer.class,ParameterMode.IN);
//		query.registerStoredProcedureParameter("MINLENGTH",Integer.class,ParameterMode.IN);
//		query.registerStoredProcedureParameter("MAXLENGTH",Integer.class,ParameterMode.IN);
//		query.registerStoredProcedureParameter("RCHAR",String.class,ParameterMode.IN);
//		query.setParameter("COUNTNO", entries);
//		query.setParameter("STARTNO", startno);
//		query.setParameter("MINLENGTH", minlength);
//		query.setParameter("MAXLENGTH", maxlength);
//		query.setParameter("RCHAR", character);
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		transaction.begin();
//		System.out.println("Starting -------------------------------");
//		try {
//			System.out.println(query.execute());
//			throw new Exception("Hell");
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//		}
//	
//	}
	


}

