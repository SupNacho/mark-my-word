package me.geeksploit.markmyword.view.listeners;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;

import java.util.Arrays;
import java.util.List;

import me.geeksploit.markmyword.R;
import me.geeksploit.markmyword.presenter.MainPresenter;

public class SwipeRefreshListener implements SwipeRefreshLayout.OnRefreshListener {

    private List<SwipeRefreshLayout> swipeRefreshLayouts;
    private MainPresenter presenter;

    public SwipeRefreshListener(MainPresenter presenter, SwipeRefreshLayout ... views) {
        this.swipeRefreshLayouts = Arrays.asList(views);
        this.presenter = presenter;
    }

    @Override
    public void onRefresh() {
        for (SwipeRefreshLayout swipeRefreshLayout : swipeRefreshLayouts) {
            if (swipeRefreshLayout.getId() == R.id.srl_list_refresh &&
                    swipeRefreshLayout.getVisibility() == View.VISIBLE) {
                swipeRefreshLayout.setRefreshing(false);
            } else if (swipeRefreshLayout.getId() == R.id.srl_card_refresh &&
                    swipeRefreshLayout.getVisibility() == View.VISIBLE) {
                swipeRefreshLayout.setRefreshing(false);
            }
            presenter.refreshWords();
        }
    }
}
