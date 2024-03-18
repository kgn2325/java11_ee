package behavioral.command;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		super();
		this.theCommand = theCommand;
	}

	public void setTheCommand(Command theCommand) {
		this.theCommand = theCommand;
	}
	
	public void pressed(boolean sw)
	{
		theCommand.execute(sw);
	}

}
