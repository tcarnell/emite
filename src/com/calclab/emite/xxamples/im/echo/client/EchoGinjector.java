package com.calclab.emite.xxamples.im.echo.client;

import com.calclab.emite.browser.client.BrowserGinjector;
import com.calclab.emite.core.client.CoreGinjector;
import com.calclab.emite.im.client.ImGinjector;

/**
 * A custom injector with the desired functionalities (not the recommended
 * way for complex apps: use constructor injection)
 */
interface EchoGinjector extends CoreGinjector, ImGinjector, BrowserGinjector {

}