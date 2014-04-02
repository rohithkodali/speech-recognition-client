package kaldi.speechkit;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;

public class ListeningDialog extends Dialog {
	private Button btn_stop ;
	private TextView tv_status;
	private TextView tv_level;
	private boolean recording = false;
	public ListeningDialog(Context context) {
		super(context);
		this.setContentView(R.layout.listening);
		this.setTitle("Title...");
		LayoutParams params = getWindow().getAttributes();
        params.width = LayoutParams.FILL_PARENT;
        getWindow().setAttributes((android.view.WindowManager.LayoutParams) params);
        tv_status = (TextView) this.findViewById(R.id.text_listeningStatus);
        tv_level = (TextView)this.findViewById(R.id.text_recordLevel);
        btn_stop = (Button) this.findViewById(R.id.btn_listeningStop);
       
	}
	
	public void prepare(Button.OnClickListener onClickListener) {
		// TODO Auto-generated method stub
		btn_stop.setOnClickListener(onClickListener);
	}

	public void setText(String string) {
		// TODO Auto-generated method stub
		tv_status.setText(string);
	}

	public void setStoppable(boolean b) {
		// TODO Auto-generated method stub
		btn_stop.setClickable(b);
	}

	public void setLevel(String dialogLevel) {
		// TODO Auto-generated method stub
		tv_level.setText(dialogLevel);
	}

	public void setRecording(boolean dialogRecording) {
		// TODO Auto-generated method stub
		recording = dialogRecording;
	}

	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLevel() {
		// TODO Auto-generated method stub
		return tv_level.getText().toString();
	}

	public boolean isRecording() {
		// TODO Auto-generated method stub
		return recording;
	}

}
