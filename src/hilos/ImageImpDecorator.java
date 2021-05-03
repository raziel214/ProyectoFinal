package hilos;

public class ImageImpDecorator extends ImageDecorator {

	public ImageImpDecorator(IImage decorateImage) {
		super(decorateImage);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String showImage() {
		
		return decorateImage.showImage();		
		
	}

}
