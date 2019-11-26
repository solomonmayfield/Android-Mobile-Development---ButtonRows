package com.example.buttonrows;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class ButtonSetFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_button_set, container, false);
		
		createButtonLabels(view);
		
		return view;
	}

	private void createButtonLabels(View view)
	{
		TableLayout tableLayout = (TableLayout)view.findViewById(R.id.button_table);
		
		for(int i=1; i < tableLayout.getChildCount(); i++)
		{
			TableRow row = (TableRow)tableLayout.getChildAt(i);
		
			for(int j=0; j < row.getChildCount(); j++)
			{
				Button button = (Button)row.getChildAt(j);
				button.setText("" + (i+j));
			}
		}
	}
}
