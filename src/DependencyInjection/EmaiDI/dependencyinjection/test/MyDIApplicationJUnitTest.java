package DependencyInjection.EmaiDI.dependencyinjection.test;

import DependencyInjection.EmaiDI.dependencyinjection.consumer.MyDIApplication;
import DependencyInjection.EmaiDI.dependencyinjection.injector.MessageServiceInjector;
import DependencyInjection.EmaiDI.dependencyinjection.service.MessageService;
import DependencyInjection.EmaiDI.dependencyinjection.consumer.Consumer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyDIApplicationJUnitTest {

	private MessageServiceInjector injector;
	@Before
	public void setUp(){
		//mock the injector with anonymous class
		injector = new MessageServiceInjector() {
			
			@Override
			public Consumer getConsumer() {
				//mock the message service
				return new MyDIApplication(new MessageService() {
					
					@Override
					public void sendMessage(String msg, String rec) {
						System.out.println("Mock Message Service implementation");
						
					}
				});
			}
		};
	}
	
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
	}
	
	@After
	public void tear(){
		injector = null;
	}

	public static class SMSServiceImpl implements MessageService {

		@Override
		public void sendMessage(String msg, String rec) {
			//logic to send SMS
			System.out.println("SMS sent to "+rec+ " with Message="+msg);
		}

	}
}
