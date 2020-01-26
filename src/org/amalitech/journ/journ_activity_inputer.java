package org.amalitech.journ;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/*
@author : SD and the wizard
@description : This activity would be used for
multiple instance of creating someting new, eg.
1. Creating new account
2. Creating a new post
3. Creating a new comment or feedback
4. Creating a new payment order

*/
public class journ_activity_inputer extends Activity{
	ImageView iv_img;
	EditText et_email, et_pswd_0, et_pswd_1;
	Button btn_sign_up;
	
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.journ_input_layout);
		
		iv_img=(ImageView)findViewById(R.id.iv_img);
		et_email=(EditText)findViewById(R.id.et_email);
		et_pswd_0=(EditText)findViewById(R.id.et_pswd_0);
		et_pswd_1=(EditText)findViewById(R.id.et_pswd_1);
		btn_sign_up=(Button)findViewById(R.id.btn_sign_up);
		
		// do defualt visibilities
		et_pswd_1.setVisibility(View.GONE);
		
		btn_sign_up.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(et_validator_bool(et_pswd_0, et_min_email_len, et_max_pswd_len )) {
					et_pswd_1.setVisibility(View.VISIBLE);
				}else {
					et_pswd_1.setVisibility(View.GONE);
				}
				
	if(et_validator_bool(et_email, et_min_email_len,et_max_email_len) 
	&& et_validator_bool(et_pswd_0, et_min_pswd_len, et_max_pswd_len)
	&& et_validator_bool(et_pswd_1, et_min_pswd_len, et_max_pswd_len)
	&& et_compare(et_pswd_0,et_pswd_1)){
		Intent main_new_page_intent = new Intent(journ_activity_inputer.this,journ_activity_MainNewsPage.class);
		startActivity(main_new_page_intent);
		finish();
		
	}else{
		
	}
	   
	   {
	}
				
			}
		});
		
	}
	
	int et_min_email_len= 8, et_max_email_len=40, 
		et_min_pswd_len= 8, et_max_pswd_len=40;
	
	public boolean et_validator_bool( EditText et, int et_min_lnf, int et_max_lnf) {
		boolean et_valid_bool = false;
		
		String et_str = et.getText().toString().trim();
		int et_countr_i = et_str.length();
		
		if(et_countr_i < et_min_lnf){
			et.setBackgroundColor(Color.RED);
			et_valid_bool = false;
		}else {
			if(et_countr_i <= et_max_lnf){
				et.setBackgroundColor(Color.WHITE);
				et_valid_bool = true;
			}else {
				et.setBackgroundColor(Color.GRAY);
				et_valid_bool = false;
			}
		}
		return et_valid_bool;
	}
	
	public boolean et_compare(EditText et_0, EditText et_1) {
		String et_0_str = et_0.getText().toString();
		String et_1_str = et_1.getText().toString();
		
		if(et_0_str.equals(et_1_str)) {
			et_0.setBackgroundColor(Color.WHITE);
			et_1.setBackgroundColor(Color.WHITE);
			return true;
		} else {
			et_0.setBackgroundColor(Color.RED);
			et_1.setBackgroundColor(Color.RED);
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onStart()
	 */
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	/* (non-Javadoc)
	 * @see android.app.Activity#onRestart()
	 */
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}
	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	/* (non-Javadoc)
	 * @see android.app.Activity#onStop()
	 */
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	/* (non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	

}
