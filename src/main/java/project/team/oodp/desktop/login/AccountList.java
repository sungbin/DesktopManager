package project.team.oodp.desktop.login;

public class AccountList implements Aggregate{
   
   private Account [] accounts;
   private int last_account = 0;
   
   public AccountList(int maxsize){
      this.accounts = new Account[maxsize];
   }
   
   public Account getAccount(int index){
      return accounts[index];
      
   }
   
   public void addAccount(Account account){
      this.accounts[last_account] = account;
      last_account++;
   }
   
   public int getLength(){
      return last_account;
   }

   @Override
   public Iterator iterator() {
      // TODO Auto-generated method stub
      return new AccountListIterator(this);
   }

}