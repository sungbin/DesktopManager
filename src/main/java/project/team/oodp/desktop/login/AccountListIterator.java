package project.team.oodp.desktop.login;
//
public class AccountListIterator implements Iterator{
	private AccountList accountList;
	private int index;
	
	
	public AccountListIterator(AccountList accountList){
		this.accountList = accountList;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < accountList.getLength();
	}


	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Account account = accountList.getAccount(index);
		index++;
		return account;
	}
}
