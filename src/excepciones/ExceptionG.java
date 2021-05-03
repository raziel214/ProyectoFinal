package excepciones;

public class ExceptionG {
	
	private IException monedasException;
	private IException nickNameException;
	private IException partidaException;
	
	public ExceptionG() {
		
		monedasException = new MonedasInsuficientesException();
		nickNameException =new NicknameYaExisteException();
		partidaException = new PartidaYaExisteException();
	}
	
	  public void showmonedasException(){
		  monedasException.NuevaException();
	    }
	  public void shownickNameException(){
		  nickNameException.NuevaException();
	    }
	  public void showpartida(){
		  partidaException.NuevaException();
	    }
	
	
	
	

}
