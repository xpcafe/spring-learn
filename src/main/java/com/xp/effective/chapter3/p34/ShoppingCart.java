package com.xp.effective.chapter3.p34;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author xp
 */
@Component
@Scope(value = "session",proxyMode = ScopedProxyMode.INTERFACES)
public class ShoppingCart {
}
