package project.team.oodp.desktop;

public class ConcreteMediator implements IMediator{
	FileMaker make;
	FileDeleter delete;

	@Override
	public void registerA(FileMaker a) {
		make = a;
	}

	@Override
	public void registerB(FileDeleter b) {
		delete = b;
	}


}
