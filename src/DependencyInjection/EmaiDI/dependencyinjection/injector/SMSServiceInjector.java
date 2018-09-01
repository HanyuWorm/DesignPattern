package DependencyInjection.EmaiDI.dependencyinjection.injector;


import DependencyInjection.EmaiDI.dependencyinjection.consumer.MyDIApplication;
import DependencyInjection.EmaiDI.dependencyinjection.test.MyDIApplicationJUnitTest;
import DependencyInjection.EmaiDI.dependencyinjection.consumer.Consumer;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new MyDIApplicationJUnitTest.SMSServiceImpl());
	}

}
