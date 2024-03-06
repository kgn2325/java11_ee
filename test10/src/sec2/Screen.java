package sec2;

public interface Screen extends RemoteControl { //같은계층이면 extends 쓴다
	int light();
	int dark();
	int zoomin();
	int zoomout();
}
