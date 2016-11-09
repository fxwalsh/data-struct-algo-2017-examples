package topic2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VideoPlayerTest {
	private VideoPlayer editor;

	@Before
	public void setUp() throws Exception {
		editor = new VideoPlayerImpl(100);
	}

	@After
	public void tearDown() throws Exception {
		editor = null;
	}

	@Test
	public void testBOT() {
		assertEquals(0, editor.currentTimePosition());
	}

	@Test
	public void testRewind() {
		editor.fastForward(30);

		editor.rewind(20);
		editor.fastForward(20);
		assertEquals(30, editor.currentTimePosition());
	}

	@Test
	public void testFFBeyondEnd() {
		editor.fastForward(50);

		editor.fastForward(60);
		editor.rewind(60);
		assertEquals(40, editor.currentTimePosition());
	}

	@Test
	public void testRewindBeyondStart() {
		editor.fastForward(50);

		editor.rewind(60);
		editor.fastForward(60);
		assertEquals(60, editor.currentTimePosition());
	}

	@Test
	public void testMark() {
		editor.fastForward(30);
		editor.markTimePosition("one");
		editor.fastForward(30);
		editor.markTimePosition("two");

		editor.gotoMark("one");
		assertEquals(30, editor.currentTimePosition());
		editor.gotoMark("two");
		assertEquals(60, editor.currentTimePosition());
	}

	@Test
	public void testFF() {
		editor.fastForward(30);
		editor.rewind(30);
		assertEquals(0, editor.currentTimePosition());
	}

}