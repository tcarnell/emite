/*
 *
 * ((e)) emite: A pure gwt (Google Web Toolkit) xmpp (jabber) library
 *
 * (c) 2008-2009 The emite development team (see CREDITS for details)
 * This file is part of emite.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.calclab.emite.xep.muc.client;

import com.calclab.emite.core.client.xmpp.stanzas.XmppURI;
import com.calclab.emite.im.client.chat.ChatManager;
import com.calclab.emite.xep.muc.client.events.RoomInvitationHandler;
import com.calclab.suco.client.events.Listener;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * RoomManager: room related methods
 * 
 * @see ChatManager
 */
public interface RoomManager extends ChatManager {
    /**
     * Accepts a room invitation event
     * 
     * @param invitation
     *            the invitation event to be accepted
     */
    public void acceptRoomInvitation(RoomInvitation invitation);

    /**
     * Add a handler to know when a room invitation has arrived
     * 
     * @param handler
     * @return
     */
    public HandlerRegistration addRoomInvitationReceivedHandler(RoomInvitationHandler handler);

    /**
     * Obtain the default history options applied to all new rooms
     * 
     * @return
     */
    public HistoryOptions getDefaultHistoryOptions();

    /**
     * Notify when a room invitation arrives.
     * 
     * Use addRoomInvitationHandler
     * 
     * @param listener
     *            the listener to be informed
     */
    @Deprecated
    public void onInvitationReceived(Listener<RoomInvitation> listener);

    public Room open(final XmppURI uri, HistoryOptions historyOptions);

    public void setDefaultHistoryOptions(HistoryOptions historyOptions);
}
