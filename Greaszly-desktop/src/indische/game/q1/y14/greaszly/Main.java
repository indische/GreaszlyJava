package indische.game.q1.y14.greaszly;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();		
		cfg.title = "Greaszly";
		cfg.useGL20 = true;
		cfg.width = 1024;
		cfg.height = 600;
		
		new LwjglApplication(new MyGdxGame(), cfg);
	}
}
