package ch09.sec06.exam03;

public class ButtonEx {
	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		class OkListenter implements Button.ClickListener {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
			
		}
		
		btnOk.setClickListener(new OkListenter());
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
			
		}
		
		btnCancel.setClickListener(new CancelListener());
		
		btnCancel.click();
	}
}
