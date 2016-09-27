package topic2;

import java.util.HashMap;
import java.util.Map;

public class VideoPlayerImpl implements VideoPlayer {
	private int duration;
	private int currentPosition;
	private Map<String, Integer> marks;

	public VideoPlayerImpl(int length) {
		this.duration = length;
		marks = new HashMap<String, Integer>();
	}

	public int currentTimePosition() {
		return currentPosition;
	}

	public void gotoMark(String name) {
		if (marks.containsKey(name)) {
			currentPosition = marks.get(name);
		}
	}

	public void markTimePosition(String name) {
		marks.put(name, currentPosition);
	}

	public void rewind(int seconds) {
		if ((currentPosition - seconds) >= 0) {
			currentPosition -= seconds;
		} else {
			currentPosition = 0;
		}
	}

	public void fastForward(int seconds) {
		if ((currentPosition + seconds) < duration) {
			currentPosition += seconds;
		} else {
			currentPosition = 100;
		}
	}
}
