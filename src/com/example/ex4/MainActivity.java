package com.example.ex4;
 
import android.app.ActionBar;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.SpinnerAdapter;
 
public class MainActivity extends ActionBar {
 
    protected void onCreate(Bundle savedInstanceState) {
        //Layout XML
        setContentView(R.layout.activity_main);
    }
    private void setContentView(int activityMain) {
		// TODO Auto-generated method stub
		
	}
	/**
     * Method fired when button App settings button is clicked
     * 
     * @param view
     */
    public void openAppInfo(View view) {
        // This application's package name
        String packageName = "com.prgguru.sdmovable";
 
        try {
            // Create Intent object to open the App info Activity of this application
            Intent intent = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
            // Set this application package as Data
            intent.setData(Uri.parse("package:" + packageName));
            // Open App info Activity
            startActivity(intent);
        } 
        // If Application package doesn't exist, open default Apps info Activity
        catch (ActivityNotFoundException e) {
            // Open the generic Apps Activity:
            Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS);
            startActivity(intent);
        }
    }
	private void startActivity(Intent intent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addOnMenuVisibilityListener(OnMenuVisibilityListener arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addTab(Tab arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addTab(Tab arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addTab(Tab arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addTab(Tab arg0, int arg1, boolean arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public View getCustomView() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getDisplayOptions() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getNavigationItemCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getNavigationMode() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getSelectedNavigationIndex() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Tab getSelectedTab() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CharSequence getSubtitle() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tab getTabAt(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getTabCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public CharSequence getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isShowing() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Tab newTab() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removeAllTabs() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeOnMenuVisibilityListener(OnMenuVisibilityListener arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeTab(Tab arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeTabAt(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectTab(Tab arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setBackgroundDrawable(Drawable arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCustomView(View arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCustomView(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCustomView(View arg0, LayoutParams arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDisplayHomeAsUpEnabled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDisplayOptions(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDisplayOptions(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDisplayShowCustomEnabled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDisplayShowHomeEnabled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDisplayShowTitleEnabled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDisplayUseLogoEnabled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setIcon(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setIcon(Drawable arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setListNavigationCallbacks(SpinnerAdapter arg0,
			OnNavigationListener arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLogo(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLogo(Drawable arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setNavigationMode(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSelectedNavigationItem(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSubtitle(CharSequence arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSubtitle(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setTitle(CharSequence arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setTitle(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
