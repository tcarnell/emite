package com.calclab.emite.xep.vcard.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

/**
 * Implements http://xmpp.org/extensions/xep-0054.html
 */
public class VCardModule extends AbstractGinModule implements EntryPoint {

    @Override
    public void onModuleLoad() {
    }

    @Override
    protected void configure() {
	bind(VCardManager.class).to(VCardManagerImpl.class).in(Singleton.class);
    }

}
