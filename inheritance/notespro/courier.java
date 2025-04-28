class courier
{
private String compName;
private parcel pr;
public void setParcel(parcel pr)
{
this.pr=pr;
}
public void getParcel()
{
System.out.println(pr.getid()+" "+pr.getName()+" "+pr.getdestAdd());

}
public void setcompName(String compName)
{
this.compName=compName;
}
public String getcompName()
{
return compName;
}
}


