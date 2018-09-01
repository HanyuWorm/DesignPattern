package DependencyInjection.EmaiDI.dependencyinjection.injector;
import DependencyInjection.EmaiDI.dependencyinjection.consumer.Consumer;
import DependencyInjection.EmaiDI.dependencyinjection.consumer.MyDIApplication;
import DependencyInjection.EmaiDI.dependencyinjection.service.EmailServiceImpl;


public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
