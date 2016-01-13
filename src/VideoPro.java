import java.io.File;
import java.net.URL;
import org.bytedeco.javacv.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.opencv_videoio.CvCapture;
import org.bytedeco.javacpp.indexer.*;
import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_objdetect.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
 import static org.bytedeco.javacpp.opencv_videoio.*;

public class VideoPro {
	
	public static void main(String [] args){
		CvCapture capture;
		IplImage frame;
		
		
		capture = cvCreateFileCapture("test.mov");
		cvNamedWindow("Video", CV_WINDOW_AUTOSIZE);
		
		for(;;){
			frame = cvQueryFrame(capture);
			
			cvShowImage("Video", frame);
			cvWaitKey(30);
			
		}
		
	}

	
	
     
/*	public void Capturing(){
		capture = cvCreateCameraCapture(-1);
		if(capture != null){
			while(true){
				frame = cvQueryFrame(capture);
				cvShowImage("heloo", frame.asCvMat());
				
				cvSaveImgae("hi.jpg", frame.asCvMat());
				
			}
		}
	}  
*/
	
	
}



