package com.example.click;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.AlarmClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class MainActivity<MyAdapter> extends Activity {
	private TextView textView;
	private ListView listView;
	
	private ListView lvs;
    
   /*
    * (non-Javadoc)Ã»ÊÂµÄ
    * @see android.app.Activity#onCreate(android.os.Bundle)
    */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    listView=(ListView) findViewById(R.id.listView1);
	    listView.setAdapter(new MyAdapter(getData()));
	    
	}
    
	public List<String> getData(){
		List<String> list=new ArrayList<String>();
		for(int i=0;i<100;i++){
			list.add("ºÙºÙ"+i);
		}
		return list;
		
	}
	
	public class MyAdapter extends BaseAdapter{
         private List<String> list;
         public MyAdapter(List<String> list) {
			this.list=list;
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return list.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			
			View view=View.inflate(MainActivity.this, R.layout.main_item, null);
			textView=(TextView)view.findViewById(R.id.textView1);
			textView.setText(list.get(position));
			return view;
			
		}
		
	}
}

	


