package foo;

public class TestBbb {
	private Aaa _aaa;
	private TestAaa _taaa;
	private Bbb _bbb;

	public TestBbb () {
		_taaa = new TestAaa();
		_aaa = new Aaa();
		_bbb = new Bbb();
	}
	public String test_aaa () {
		return _taaa.aaa();
	}
	public String aaa () {
		return _aaa.aaa();
	}
	public String bbb () {
		return _bbb.bbb();
	}
}
