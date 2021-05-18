package hilos;

public class ImageDecorator implements IImage {
	
	protected IImage decorateImage;
	
	

	public ImageDecorator(IImage decorateImage) {
		
		this.decorateImage = decorateImage;
	}



	@Override
	public String showImage() {
		
		return decorateImage.showImage();
	}

}

