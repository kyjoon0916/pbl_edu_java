package chap9nestInterface;

public class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("�޽����� �����ϴ�.");
	}
}
