package chapter11.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

//jvm 끼리의 통신을 위한 remote를 상속받은 인터페이스
public interface GumballMachineRemote extends Remote{
	//리턴 형식은 원시 혹은 Serializable이어야 한다
	//remoteException을 예외로 던져야 한다
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
