public class UniversalRemote {
	public static void main(String[] args) {
		System.out.println("Demonstration of Remote");
		Tv tv=new Tv();
		SetTopBox setTopBox=new SetTopBox();
		NetFlix netFlix=new NetFlix();
		SoundSystem soundSystem=new SoundSystem();
		
		FatherNewsChannelCommand fncc=new FatherNewsChannelCommand(tv, setTopBox, soundSystem, netFlix);
		MotherSerialCommand msc=new MotherSerialCommand(tv, setTopBox, soundSystem, netFlix);
		MotherOldMovieCommand momc=new MotherOldMovieCommand(tv, setTopBox, soundSystem, netFlix);
		
		Remote universalRemote=new Remote();
		universalRemote.executeCommand(1);
		universalRemote.setCommand(fncc, 0);
		universalRemote.setCommand(momc, 1);
		universalRemote.setCommand(msc, 2);
		
		System.out.println("My father wants to see news channel");
		universalRemote.executeCommand(0);
				
	}
}
class Tv{
	public void av1() {
		System.out.println(" av1 mode on");
	}
	public void switchOn() {
		System.out.println("tv switched on");
	}
}
class SetTopBox{
	public void newsChannel() {
		System.out.println("news started");
	}
	public void serialChannel() {
		System.out.println("serial started");
	}
}
class NetFlix{
	public void movieOld() {
		System.out.println("old movie started");
	}

	public void OldMovie() {
		// TODO Auto-generated method stub
		
	}
}
class SoundSystem{
	public void lowSound() {
		System.out.println("sound volume-decreased");
	}
}
interface Command{
	public void execute() ;
}
class FatherNewsChannelCommand implements Command{
	Tv tv;SetTopBox setTopBox; SoundSystem soundSystem;NetFlix netFlix;
	public FatherNewsChannelCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}

	@Override
	public void execute() {
		System.out.println("Father Tv action started....");
		tv.switchOn();
		tv.av1();
		setTopBox.newsChannel();
		soundSystem.lowSound();
		System.out.println("dad enjoy your news channel....");
	}
}
class MotherOldMovieCommand implements Command{
	Tv tv;SetTopBox setTopBox; SoundSystem soundSystem;NetFlix netFlix;
	public MotherOldMovieCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}
	@Override
	public void execute() {
		System.out.println("mother old movie command started...");
		tv.switchOn();
		tv.av1();
		netFlix.OldMovie();
		System.out.println("enjoy the old movie mom");
	}
}
class MotherSerialCommand implements Command{
	Tv tv;SetTopBox setTopBox; SoundSystem soundSystem;NetFlix netFlix;
	public MotherSerialCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}
	@Override
	public void execute() {
		System.out.println("mother serial command started");
		tv.switchOn();
		tv.av1();
		setTopBox.serialChannel();
		System.out.println("enjoy the serial mom");
	}
}
class DummyCommand implements Command{
	@Override
	public void execute() {
		System.out.println("Dummy Button");
	}
}
class Remote{
	Command command[]=new Command[5];
	public Remote() {
		for(int i=0;i<command.length;i++) {
			command[i]=new DummyCommand();
		}
	}
	public void setCommand(Command command,int slot) {
		this.command[slot]=command;
	}
	public void executeCommand(int slot) {
		command[slot].execute();
	}
}
