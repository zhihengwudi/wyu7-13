package semaphore;

public class WcTask implements Runnable {

	private Wc wc;

	public WcTask(Wc wc) {
		super();
		this.wc = wc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		wc.paidui();// 调用Wc类的任务方法

	}

}
