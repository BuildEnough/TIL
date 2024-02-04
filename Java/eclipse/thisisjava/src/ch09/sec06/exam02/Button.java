package ch09.sec06.exam02;

public class Button {
	public static interface ClickListener {
		
		void onCilck();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

}
