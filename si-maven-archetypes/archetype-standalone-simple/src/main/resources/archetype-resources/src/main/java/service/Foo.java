#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

@Deprecated
public class Foo {

	private String test;
	
	private String test2;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	/** @deprecated **/
	public String getTest2() {
		return test2;
	}

	/** @deprecated **/
	public void setTest2(String test2) {
		this.test2 = test2;
	}
	
	
	
}
