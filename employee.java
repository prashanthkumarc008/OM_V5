class Employee
{
    private int empid;
    private string empname;
    public void setempid(int eid)
    {
        this.empid=eid;
    } 
    public int getempid()
    {
        return this.empid;
    }
    public void setEmpName(string name)
    {
        this.empname=name;

    }
    public string getempname()
    {
        return this.empname;

    }


public static void main (string[] args)
{
    Employee e1= new Employee();
    e1.setempid(101);
    e1.setEmpName("rahul");

    Employee e2=new employee();
    e2.setempid(102);
    e2.setEmpName("sanjay");
}
}