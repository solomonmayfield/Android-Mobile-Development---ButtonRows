package com.example.buttonrows;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.Menu;

public class ButtonSetActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new ButtonSetFragment();
	}
}