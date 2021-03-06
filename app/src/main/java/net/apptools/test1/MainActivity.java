package net.apptools.test1;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {
	private FragmentTabHost mTabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

		mTabHost.addTab(
				mTabHost.newTabSpec("tab1").setIndicator("버스", null),
				FragmentTab.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("tab2").setIndicator("지하철", null),
				FragmentTab2.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("tab3").setIndicator("즐겨찾기", null),
				FragmentTab3.class, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
