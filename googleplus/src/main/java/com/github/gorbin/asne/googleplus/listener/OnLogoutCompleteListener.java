package com.github.gorbin.asne.googleplus.listener;

/**
 * Created by tylerroach on 12/3/14.
 */

import com.github.gorbin.asne.core.listener.base.SocialNetworkListener;

/**
 * Interface definition for a callback to be invoked when logout complete.
 *
 * @author Anton Krasov
 * @author Evgeny Gorbin (gorbin.e.o@gmail.com)
 */
public interface OnLogoutCompleteListener extends SocialNetworkListener {
    /**
     * Called when login complete.
     * @param socialNetworkID id of social network where request was complete
     */
    public void onLogoutSuccess(int socialNetworkID);
}
