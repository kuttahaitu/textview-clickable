package com.criexample.tv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import java.util.List;
import  com.cri.clickabletextview.ClickAbleWords;
import java.util.ArrayList;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;
import android.text.TextPaint;
import com.cri.clickabletextview.CriTextView;
public class MainActivity extends AppCompatActivity {
	List<ClickAbleWords>clickablewords;
	CriTextView critextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		critextview=findViewById(R.id.activity_maincom_criexample_tv_CriTextView);
		clickablewords=new ArrayList<ClickAbleWords>();
		ClickableSpan clickspa=new ClickableSpan(){

			@Override
			public void onClick(View p1) {
				//your text click action here
				Toast.makeText(getApplicationContext(),"Successful",Toast.LENGTH_LONG).show();
				
			}
			//add this line for underline the words
			@Override
			public void updateDrawState(TextPaint txtpaint){
				super.updateDrawState(txtpaint);
				txtpaint.setUnderlineText(true);
			}
			
		};
		ClickAbleWords newWord=new ClickAbleWords("Click here",clickspa);
		clickablewords.add(newWord);
		critextview.setTextWithSpacificClick("For Making a Toast Click here",clickablewords);
        
    }
    
}
/*subscribe to my youtube channel
youtube.com/@matrixcri
*/
