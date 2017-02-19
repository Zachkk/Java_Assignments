package chapter3.pChallenge7;

/**
 * 
 * @author Zack Flowers
 * Date: 2/19/2017
 * Chapter: 3
 * Programming Challenge 7
 * 
 */
public class WidgetFactoryDemo {

	public static void main(String[] args)
	{
		// Create an instance of WidgetFactory with 1234 widgets
		WidgetFactory widget = new WidgetFactory(1234);
		
		// Display the appropriate information
		System.out.printf("# of Widgets: \t\t%.0f\n"+
						"Days to Complete: \t%.2f", 
						widget.getWidgets(), widget.getProductionTime());
	}
}
