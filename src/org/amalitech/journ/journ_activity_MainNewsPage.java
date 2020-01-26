package org.amalitech.journ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

public class journ_activity_MainNewsPage extends Activity{
	
	TextView tab_1;
	Button btn_base_0, btn_base_1;
	Context ctx;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//set content view
		setContentView(R.layout.journ_main_news_page_layout);
		ctx = journ_activity_MainNewsPage.this;
		
		// bind layout to element
		tab_1 = (TextView)findViewById(R.id.nav_tv_1);
		btn_base_0 = (Button)findViewById(R.id.base_btn_0);
		btn_base_1 = (Button)findViewById(R.id.base_btn_1);
		
		
		btn_base_0.setText(getResources().getString(R.string.get_your_account_for_more_features));
		
		tab_1.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(v.getId() == tab_1.getId()) {
					
					switch (event.getActionMasked()) {
					case MotionEvent.ACTION_DOWN:
					case MotionEvent.ACTION_POINTER_DOWN:{
						break;
					}
					case MotionEvent.ACTION_UP:
					case MotionEvent.ACTION_POINTER_UP:{
						Intent activity_post_intent = new Intent(journ_activity_MainNewsPage.this, journ_activity_poster.class);
						startActivity(activity_post_intent);
						break;
					}
					case MotionEvent.ACTION_MOVE:{
						break;
					}
					}
				}
				return true;
			}
		});
		
		for(int x=0; x<3; x++) {
			if(x==0) {
				nav_V(3, "nav_v_", x).setVisibility(View.VISIBLE);
			}else {
				nav_V(3, "nav_v_", x).setVisibility(View.GONE);
			}
		}
	}
	
	public TextView nav_TV(int total_num_i, String prefix_str, int tv_i){
		String[] textView_tv_ids = new String[total_num_i];
		TextView[] textView_full_IDs = new TextView[total_num_i];
		textView_tv_ids[tv_i] = prefix_str+Integer.toString(tv_i);
		
		int textView_tv_ID = ctx.getResources().getIdentifier(textView_tv_ids[tv_i], "id", "org.amalitech.journ");
		textView_full_IDs[tv_i] = (TextView)findViewById(textView_tv_ID);
		
		return textView_full_IDs[tv_i];

	}
	
	public  View nav_V(int total_num_i, String prefix_str, int v_i) {
		String[] view_ids = new String[total_num_i];
		View[] view_full_IDs = new View[total_num_i];
		
		view_ids[v_i] = prefix_str+Integer.toString(v_i);
		
		int view_ID = ctx.getResources().getIdentifier(view_ids[v_i], "id", "org.amalitech.journ");
		view_full_IDs[v_i] = (View)findViewById(view_ID);
		
		// TODO Auto-generated method stub
		return view_full_IDs[v_i];

	}

}
