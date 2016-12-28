package com.byl.listviewwithgrid;


import java.util.ArrayList;
import java.util.List;

import com.byl.listviewwithgrid.adapter.TestListViewAdapter;
import com.byl.listviewwithgrid.bean.TestBean;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ListView listview;
	private TestListViewAdapter listViewAdapter ;
	private List<TestBean> listBean;
	private String imgs1;
	private String imgs2;
	private String imgs3;
	private String imgs4;
	private String imgs5;
	private String imgs6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listBean=new ArrayList<TestBean>();
		initView();
        initData();
	}

	private void initView() {
		listview=(ListView) findViewById(R.id.listview);
		
	}

	private void initData() {
		/*
		 * ���ģ�����ݣ���������£���Щ�����Ǵӷ���˻�ȡ��
		 * �˴�������������ݣ���ӦGridview��ͼƬ����
		 */
		//ģ���û�������ͼƬ��·����"#"����
		imgs1="http://t10.baidu.com/it/u=2565424359,3856609610&fm=58";
		imgs2="http://t10.baidu.com/it/u=2565424359,3856609610&fm=58#http://t10.baidu.com/it/u=374721516,1427740298&fm=58";
		imgs3="http://t10.baidu.com/it/u=2565424359,3856609610&fm=58#http://t10.baidu.com/it/u=374721516,1427740298&fm=58#http://t11.baidu.com/it/u=3158457091,3429860559&fm=58";
		imgs4="http://t10.baidu.com/it/u=2565424359,3856609610&fm=58#http://t10.baidu.com/it/u=374721516,1427740298&fm=58#http://t11.baidu.com/it/u=3158457091,3429860559&fm=58#http://t12.baidu.com/it/u=732128477,3149312025&fm=58";
		imgs5="http://t10.baidu.com/it/u=2565424359,3856609610&fm=58#http://t10.baidu.com/it/u=374721516,1427740298&fm=58#http://t11.baidu.com/it/u=3158457091,3429860559&fm=58#http://t12.baidu.com/it/u=732128477,3149312025&fm=58#http://t11.baidu.com/it/u=2722915642,3232472693&fm=58";
		imgs6="http://t10.baidu.com/it/u=2565424359,3856609610&fm=58#http://t10.baidu.com/it/u=374721516,1427740298&fm=58#http://t11.baidu.com/it/u=3158457091,3429860559&fm=58#http://t12.baidu.com/it/u=732128477,3149312025&fm=58#http://t11.baidu.com/it/u=2722915642,3232472693&fm=58#http://t12.baidu.com/it/u=1313963321,225077119&fm=58";
		
		TestBean bean=null;
		for(int i=0;i<7;i++){
			bean=new TestBean();
			switch (i) {
			case 0:
				bean.setUsername("������");
				bean.setHeadphoto("http://avatar.csdn.net/3/B/9/1_baiyuliang2013.jpg");
				bean.setContent("��ӭ��ע���˲��ͣ�http://blog.csdn.net/baiyuliang2013");
				bean.setTime("1����ǰ");
				break;
			case 1:
				bean.setUsername("���»�");
				bean.setHeadphoto("http://t10.baidu.com/it/u=2565424359,3856609610&fm=58");
				bean.setContent("��Һã��������»�");
				bean.setTime("3����ǰ");
				bean.setImages(imgs1);
				break;
			case 2:
				bean.setUsername("��ѧ��");
				bean.setHeadphoto("http://t10.baidu.com/it/u=374721516,1427740298&fm=58");
				bean.setContent("��Һã�������ѧ��");
				bean.setTime("5����ǰ");
				bean.setImages(imgs2);
				break;
			case 3:
				bean.setUsername("������");
				bean.setHeadphoto("http://t11.baidu.com/it/u=3158457091,3429860559&fm=58");
				bean.setContent("��Һã����ǹ�����");
				bean.setTime("1Сʱǰ");
				bean.setImages(imgs3);
				break;
			case 4:
				bean.setUsername("����");
				bean.setHeadphoto("http://t12.baidu.com/it/u=732128477,3149312025&fm=58");
				bean.setContent("��Һã���������");
				bean.setTime("2Сʱǰ");
				bean.setImages(imgs4);
				break;
			case 5:
				bean.setUsername("�����");
				bean.setHeadphoto("http://t11.baidu.com/it/u=2722915642,3232472693&fm=58");
				bean.setContent("��Һã����ǽ����");
				bean.setTime("����");
				bean.setImages(imgs5);
				break;
			case 6:
				bean.setUsername("������");
				bean.setHeadphoto("http://t12.baidu.com/it/u=1313963321,225077119&fm=58");
				bean.setContent("��Һã����ǹ�����");
				bean.setTime("ǰ��");
				bean.setImages(imgs6);
				break;
			}
			listBean.add(bean);//��ӽ�list
		}
		
		listViewAdapter=new TestListViewAdapter(this, listBean);
		listview.setAdapter(listViewAdapter);
		listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
				Toast.makeText(MainActivity.this, "����˵�"+(arg2+1)+"��", Toast.LENGTH_LONG).show();
			}
		});
	}

}
