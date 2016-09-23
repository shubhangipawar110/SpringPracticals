import org.springframework.jdbc.core.JdbcTemplate;

public class DemoBean 
{
	private JdbcTemplate jt;
	private String name;

	DemoBean(JdbcTemplate jt,String name)
	{
		this.jt=jt;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void createTable()
	{
		jt.execute("create table Student (id int NOT NULL IDENTITY(1,1),name varchar(50))");
		System.out.println("table created");
	}
    public void insertRow()
    {
    	int i = jt.update("insert into Student(name) values('"+getName()+"')");
    	System.out.println("record inserted sucessfully");
    }
}
