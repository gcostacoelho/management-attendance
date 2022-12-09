package Interfaces;

public interface Observable {
	
	public void subscribe(Observer obs);
	public void unsubscribe(Observer obs);
	public void notifica();
	
}
