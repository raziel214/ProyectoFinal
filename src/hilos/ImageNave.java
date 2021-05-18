package hilos;

public class ImageNave implements IImage  {
	
	private String route;

	@Override
	public String showImage() {
		// TODO Auto-generated method stub
		route="./data/imagenes/Naves/r0.png";
		return route;
	}

}