package excepciones;

public class ExceptionG {
	private IException monedasException;
	private IException nickNameException;
	private IException partidaException;
	
	public ExceptionG() {
		
		monedasException = new MonedasInsuficientesException();
		nickNameException =new NicknameYaExisteException(null);
		partidaException = new PartidaYaExisteException(null);
	}
	
	  public void showmonedasException(){
		  monedasException.NuevaExcepcion();
	    }
	  public void shownickNameException(){
		  nickNameException.NuevaExcepcion();
	    }
	  public void showpartidaException(){
		  partidaException.NuevaExcepcion();
	    }
	
	

}
