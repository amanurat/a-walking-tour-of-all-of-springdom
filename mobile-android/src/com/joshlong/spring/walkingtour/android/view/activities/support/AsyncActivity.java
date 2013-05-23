package com.joshlong.spring.walkingtour.android.view.activities.support;

/**
 * @author Roy Clarkson
 */
public interface AsyncActivity {

    public void showLoadingProgressDialog();

    public void showProgressDialog(CharSequence message);

    public void dismissProgressDialog();

}