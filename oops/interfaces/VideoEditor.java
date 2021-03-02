package oops.interfaces;

public interface VideoEditor {
	default void editVideo() {
		System.out.println("Video is been edited");
	}

}
