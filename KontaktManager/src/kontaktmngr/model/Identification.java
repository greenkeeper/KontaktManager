package kontaktmngr.model;

import kontaktmngr.dal.Visitor;

public class Identification extends DefaultEntity
{
	private final String _type;
	private String _identification;
	
	

	public Identification(int id, String type, String identification, String description)
	{
		super(id, description);
		_type = type;
		_identification = identification;
	}
	
	
	
	public String getType()
	{
		return _type;
	}
	
	public String getIdentification()
	{
		return _identification;
	}
	
	public void setIdentification(String identification)
	{
		_identification = identification;
	}



	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}
}
