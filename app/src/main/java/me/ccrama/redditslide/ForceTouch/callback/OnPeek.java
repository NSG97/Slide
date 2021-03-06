package me.ccrama.redditslide.ForceTouch.callback;

import android.view.View;

import me.ccrama.redditslide.ForceTouch.PeekView;
import me.ccrama.redditslide.ForceTouch.builder.Peek;

/**
 * Provides callbacks for the lifecycle events of the PeekView
 */
public interface OnPeek {

    void onInflated(PeekView rootView, View contentView);
    void shown();
    void dismissed();

}
