package decorator.pattern.demo1;

public class AbstractDecorator extends Component{

	protected Component com ;
	
	public void SetTheComponent(Component c){
		com = c;
	}
	
	public void doJob(){
		if (com != null){
			com.doJob();
		}
	}
}
