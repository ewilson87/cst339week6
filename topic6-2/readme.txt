The init() and destroy() methods are called once each due to the lifecycle of the bean in the Spring application. The init method is called when the bean is created, and the destroy method is called when the bean is destroyed.

After adding the @Scope to the SpringConfig file, the init() method gets called for everytime the bean gets called. In this case, for each login under the doLogin() method of the controller, the bean gets called twice. Once for the test() method, and once for the getOrders() method. Interestingly, the destroy() method is never called in this example.

When replacing the @Scope with @RequestScope, now the beans init() and destroy() method gets called once per request. So every time the login is made, the bean gets created and destroyed.

When using @SessionScope, the init() method is called the first time I log in during the session. If I keep the browser open (Microsoft Edge in this case) and perform the same action again in a new tab or browser window, the init() method is not called again. However, if I perform the action in private/incognito mode, the init() method is called again as it is seen as a different session. 