package project.team.oodp.desktop;

public class GuestConcreteMediator implements GuestIMediator{
	GuestFileMaker guestMake;
	GuestFileDeleter guestDelete;
	
	@Override
	public void GuestRegister1(GuestFileMaker A) {
		guestMake = A;
	}
	@Override
	public void GuestRegister2(GuestFileDeleter B) {
		guestDelete = B;
	}


}
