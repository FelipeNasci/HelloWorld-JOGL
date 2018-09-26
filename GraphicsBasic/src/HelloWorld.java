
import Graphics.Renderer;
import Graphics.Window;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;
import java.awt.BorderLayout;
import javafx.scene.layout.Border;

public class HelloWorld {
//principal
    public static void main(String[] args) {
        
       final GLProfile profile = GLProfile.get(GLProfile.GL2);
       
        GLCapabilities capabilities = new GLCapabilities(profile);
        capabilities.setDoubleBuffered(true);
        capabilities.setHardwareAccelerated(true);
        
        GLCanvas canvas = new GLCanvas(capabilities);
        FPSAnimator animator = new FPSAnimator(canvas, 60);
        Renderer renderer = new Renderer();
        
        Window window = new Window("OpenGL", animator, 512, 512);
        
        canvas.addGLEventListener(renderer);
        
        window.setGLCanvas(canvas, BorderLayout.CENTER);
        animator.start();
        
        window.setVisibility(true);
        
        
    }
    
}
