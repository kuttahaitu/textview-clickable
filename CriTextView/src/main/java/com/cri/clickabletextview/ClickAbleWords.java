package com.cri.clickabletextview;
import android.text.style.ClickableSpan;

public class ClickAbleWords {
		private String word;
		private ClickableSpan clickablespan;
		public ClickAbleWords(String word,ClickableSpan clickablespan){
			this.word=word;
			this.clickablespan=clickablespan;
		}
		public String getWords(){
			return word;
		}
		public ClickableSpan getClickableSpan(){
			return clickablespan;
		}
    
}
