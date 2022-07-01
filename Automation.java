package org.system;

public class Automation extends MultipleLanguage implements TestTool{

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("JAVA");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}
public static void main(String[] args) {
	Automation automation = new Automation();
	automation.Selenium();
	automation.Java();
	automation.ruby();
	automation.python();
}
}
