package com.cri.clickabletextview;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;
import java.util.List;
import android.text.method.LinkMovementMethod;

public class CriTextView extends TextView{
	public CriTextView(Context cntxt){
		super(cntxt);
	}
    public CriTextView(Context cntxt,AttributeSet attrs){
		super(cntxt,attrs);
	}
	public CriTextView(Context cntext,AttributeSet attrs,int defaultStyle){
		super(cntext,attrs,defaultStyle);
	}
    private SpannableStringBuilder addClickablePart(String string,
	List<ClickAbleWords>cickablewords){
		SpannableStringBuilder spanbuilder=new SpannableStringBuilder(string);
		for(ClickAbleWords clickableWord:cickablewords){
			int idx1=string.indexOf(clickableWord.getWords());
			int idx2=0;
			while(idx1!=-1){
				idx2=idx1+clickableWord.getWords().length();
				spanbuilder.setSpan(clickableWord.getClickableSpan(),idx1,idx2,0);
				idx1=string.indexOf(clickableWord.getWords(),idx2);
			}
		}
		return spanbuilder;
	}
	public void setTextWithSpacificClick(String text,
	List<ClickAbleWords>clickablewords){
		setMovementMethod(LinkMovementMethod.getInstance());
		setText(addClickablePart(text,clickablewords),BufferType.SPANNABLE);
	}
}
