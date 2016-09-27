package topic2;

public interface VideoPlayer
{
 public void fastForward (int seconds);
 public void rewind (int seconds);
 public int currentTimePosition ();
 public void markTimePosition (String name);
 public void gotoMark (String name);
}
