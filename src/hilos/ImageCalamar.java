package hilos;

public class ImageCalamar implements IImage{

	private String route;

	@Override
	public String showImage() {
		// TODO Auto-generated method stub
		route="./data/imagenes/Naves/p0.png";
		return route;
	}

}
