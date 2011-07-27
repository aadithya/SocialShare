package com.SocialShare.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
/*Aadi: I just edited this */

@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String greetServer(String name);
}
