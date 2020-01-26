package org.amalitech.journ;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class journ_activity_poster extends Activity {
	RelativeLayout activity_inputer_parent_id_rl;
	Button btn_new_post;
	ImageView iv_img_cancel;
	TextView tab_2,tab_0;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//set the content view
		setContentView(R.layout.journ_activity_poster);
		
		// Bind the layout to the initialize element
		activity_inputer_parent_id_rl = (RelativeLayout)findViewById(R.id.activity_inputer_parent_id);
		btn_new_post = (Button)findViewById(R.id.base_btn_0);
		iv_img_cancel = (ImageView)findViewById(R.id.iv_img_cancel);
		tab_2 = (TextView)findViewById(R.id.nav_tv_2);
		tab_0 = (TextView)findViewById(R.id.nav_tv_0);
		
		
		//set an on-touch listener
		btn_new_post.setText(getResources().getString(R.string.new_post));
		
		btn_new_post.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(v.getId() == btn_new_post.getId()) {
					switch (event.getActionMasked()) {
					
					case MotionEvent.ACTION_DOWN:
					case MotionEvent.ACTION_POINTER_DOWN: {
						break;
					}
					case MotionEvent.ACTION_UP:
					case MotionEvent.ACTION_POINTER_UP: {
						if(!activity_inputer_parent_id_rl.isShown()) {
							activity_inputer_parent_id_rl.setVisibility(View.VISIBLE);
						}
						
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
		
		
   tab_2.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(v.getId() == tab_2.getId()) {
					
					switch (event.getActionMasked()) {
					case MotionEvent.ACTION_DOWN:
					case MotionEvent.ACTION_POINTER_DOWN:{
						break;
					}
					case MotionEvent.ACTION_UP:
					case MotionEvent.ACTION_POINTER_UP:{
						Intent activity_post_intent = new Intent(journ_activity_poster.this, journ_activity_MainNewsPage.class);
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
		
		
   tab_0.setOnTouchListener(new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			if(v.getId() == tab_0.getId()) {
				
				switch (event.getActionMasked()) {
				case MotionEvent.ACTION_DOWN:
				case MotionEvent.ACTION_POINTER_DOWN:{
					break;
				}
				case MotionEvent.ACTION_UP:
				case MotionEvent.ACTION_POINTER_UP:{
					Intent activity_post_intent = new Intent(journ_activity_poster.this, journ_activity_MainNewsPage.class);
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
		
		
		iv_img_cancel.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (v.getId() == iv_img_cancel.getId()) {
				switch (event.getActionIndex()) {
				
				case MotionEvent.ACTION_DOWN:
				case MotionEvent.ACTION_POINTER_DOWN:{
					break;
				}
				case MotionEvent.ACTION_UP:
				case MotionEvent.ACTION_POINTER_UP:{
					if(!activity_inputer_parent_id_rl.isShown()) {
						activity_inputer_parent_id_rl.setVisibility(View.GONE);
					}
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
	}

	public void onBackPressed() {
		if(activity_inputer_parent_id_rl.isShown()) {
			activity_inputer_parent_id_rl.setVisibility(View.GONE);
		}else {
			super.onBackPressed();
		}
	}
	
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
	
	
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
