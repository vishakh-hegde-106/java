package mynewthread;

public class threadprg extends Thread{
	
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("thread -"+i);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadprg mnt=new threadprg();
		mnt.start();

	}

}
