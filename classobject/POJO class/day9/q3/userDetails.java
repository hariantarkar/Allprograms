class userDetails
{
	private Bank bank;
public void setBank(Bank bank)
{
	this.bank=bank;
}
	public void show()
	{
		System.out.println(bank.getAcountNo()+" "+bank.getBalance());
	}
}
