package com.beanu.arad.base;

import android.widget.ImageView;

import com.beanu.arad.utils.AnimUtil;

/**
 *ToolBar
 */
public class ToolBarActivity extends _ToolBarActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        AnimUtil.intentSlidOut(this);
    }

    @Override
    protected String setupToolBarTitle() {
        return null;
    }

    @Override
    protected boolean setupToolBarLeftButton(ImageView leftButton) {
        return false;
    }

    @Override
    protected boolean setupToolBarRightButton(ImageView rightButton) {
        return false;
    }
}